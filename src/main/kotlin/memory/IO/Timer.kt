package memory.IO

import memory.Memory
import memory.Mmu
import utils.getBit
import utils.getSecondByte
import utils.toHexString

class Timer : Memory {
    private var internalCounter = 0

    private var TIMA = 0
    private var TMA = 0
    private var TAC = 0

    private var selectedBit = 9

    private val clock0Cycles = 1024
    private val clock1Cycles = 16
    private val clock2Cycles = 64
    private val clock3Cycles = 256

    private var timerCycles = clock0Cycles
    private var timerCounter = 0

    override fun reset() {
        internalCounter = 0xABCC
        timerCounter = 0
        timerCycles = clock0Cycles
        TIMA = 0
        TMA = 0
        TAC = 0
    }

    // TODO this implementation is currently a mess
    fun tick(cycles: Int) {
        // Get current value of the counter
        val oldCounter = internalCounter

        // Set new value of the counter
        internalCounter += cycles
        internalCounter = internalCounter and 0xFFFF

        // update timer
        // If timer enabled
        if (TAC.getBit(2)) {
            timerCounter += cycles

            while (timerCounter >= timerCycles) {
                timerCounter -= timerCycles
                TIMA++

                if (TIMA > 0xFF) {
                    TIMA = TMA
                    requestInterrupt(2)
                }
            }
        }
    }

    override fun readByte(address: Int): Int {
        return when(address) {
            Mmu.DIV -> this.internalCounter.getSecondByte()
            Mmu.TIMA -> this.TIMA
            Mmu.TMA -> this.TMA
            Mmu.TAC -> this.TAC or 0b11111000
            else -> throw IllegalArgumentException("Address ${address.toHexString()} does not belong to Timer")
        }
    }

    override fun writeByte(address: Int, value: Int) {
        val newVal = value and 0xFF

        when(address) {
            Mmu.DIV -> {
                // Writing to DIV can trigger TIMA increases
                if (internalCounter.getBit(selectedBit)) {
                    TIMA++

                    if (TIMA > 0xFF) {
                        TIMA = TMA
                        requestInterrupt(2)
                    }
                }

                internalCounter = 0
                timerCounter = 0
            }
            Mmu.TIMA -> this.TIMA = newVal
            Mmu.TMA -> this.TMA = newVal
            Mmu.TAC -> {
                // Disabling can trigger TIMA increase
                if (TAC.getBit(2) && !newVal.getBit(2) && internalCounter.getBit(selectedBit)) {
                    TIMA++

                    if (TIMA > 0xFF) {
                        TIMA = TMA
                        requestInterrupt(2)
                    }
                }

                this.TAC = newVal

                val freq = newVal and 0b11
                when (freq) {
                    0b00 -> timerCycles = clock0Cycles
                    0b01 -> timerCycles = clock1Cycles
                    0b10 -> timerCycles = clock2Cycles
                    0b11 -> timerCycles = clock3Cycles
                }

                when (freq) {
                    0b00 -> selectedBit = 9
                    0b11 -> selectedBit = 7
                    0b10 -> selectedBit = 5
                    0b01 -> selectedBit = 3
                }
            }
            else -> throw IllegalArgumentException("Address ${address.toHexString()} does not belong to Timer")
        }
    }
}