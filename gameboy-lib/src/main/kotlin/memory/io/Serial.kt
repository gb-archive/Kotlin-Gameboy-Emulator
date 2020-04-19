package memory.io

import memory.Memory
import memory.Mmu
import utils.getBit
import utils.setBit
import utils.toHexString

class Serial : Memory {

    private var SB = 0
    private var SC = 0

    private var inProgress = false
    private var shiftClock = false

    var testOutput = false

    init {
        reset()
    }

    override fun reset() {
        SB = 0
        SC = 0
    }

    override fun readByte(address: Int): Int {
        return when(address) {
            Mmu.SB -> this.SB
            Mmu.SC -> {
                var result = 0b01111110
                result = setBit(result, 7, inProgress)
                result = setBit(result, 0, shiftClock)
                result
            }
            else -> throw IllegalArgumentException("Address ${address.toHexString()} does not belong to Serial")
        }
    }

    override fun writeByte(address: Int, value: Int) {
        val newVal = value and 0xFF

        if (address == 0xFF02 && value == 0x81) {
            testOutput = true
        }

        when(address) {
            Mmu.SB -> this.SB = newVal
            Mmu.SC -> {
                inProgress = newVal.getBit(7)
                shiftClock = newVal.getBit(0)
            }
            else -> throw IllegalArgumentException("Address ${address.toHexString()} does not belong to Serial")
        }
    }

}