package cpu.instructions.alu

import cpu.Registers
import memory.Mmu
import utils.Log

class INC_HL(registers: Registers, mmu: Mmu) : INC(registers, mmu) {

    override val totalCycles = 12

    private var address = 0

    override fun tick() {
        when(currentCycle) {
            0 -> {
                address = registers.getHL()
                value = mmu.readByte(address)
            }
            4 -> {
                mmu.writeByte(address, value + 1)

                val zFlag = mmu.readByte(address) == 0
                registers.setZFlag(zFlag)

                super.inc(value)
            }
            8 -> {

            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}