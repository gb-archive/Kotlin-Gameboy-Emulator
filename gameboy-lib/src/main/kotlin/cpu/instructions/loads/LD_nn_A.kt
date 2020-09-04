package cpu.instructions.loads

import cpu.Registers
import cpu.instructions.Instruction
import memory.Mmu
import utils.Log
import utils.setSecondByte

class LD_nn_A(registers: Registers, mmu: Mmu) : Instruction(registers, mmu) {

    private var address = 0
    override val totalCycles = 16

    override fun reset() {
        super.reset()
        address = 0
    }

    override fun tick() {
        when(currentCycle) {
            0 -> {

            }
            4 -> {
                address = getImmediate()
            }
            8 -> {
                address = setSecondByte(address, getImmediate())
            }
            12 -> {
                mmu.writeByte(address, registers.A)
            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}