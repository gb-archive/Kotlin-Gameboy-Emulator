package gameboy.cpu.instructions.alu

import gameboy.cpu.Registers
import gameboy.memory.Mmu
import gameboy.utils.Log

class ADD_A_HL(registers: Registers, mmu: Mmu) : ADD(registers, mmu) {

    override val totalCycles = 8

    override fun tick() {
        when(currentCycle) {
            0 -> {
            }
            4 -> {
                value = mmu.readByte(registers.getHL())
                super.add8(value)
            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}