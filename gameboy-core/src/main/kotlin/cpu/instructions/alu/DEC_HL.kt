package cpu.instructions.alu

import cpu.Registers
import memory.Mmu
import utils.Log

class DEC_HL(registers: Registers, mmu: Mmu) : DEC(registers, mmu) {

    override val totalCycles = 12

    private var address = 0

    override fun tick() {
        when(currentCycle) {
            0 -> {
                address = registers.getHL()
                value = mmu.readByte(address)
            }
            4 -> {
                mmu.writeByte(address, value - 1)

                val zFlag = mmu.readByte(address) == 0
                registers.setZFlag(zFlag)

                super.dec(value)
            }
            8 -> {

            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}