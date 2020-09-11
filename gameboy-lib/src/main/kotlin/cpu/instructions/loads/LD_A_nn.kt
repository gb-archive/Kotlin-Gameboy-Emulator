package gameboy.cpu.instructions.loads

import gameboy.cpu.Registers
import gameboy.cpu.instructions.Instruction
import gameboy.memory.Mmu
import gameboy.utils.Log
import gameboy.utils.setSecondByte

class LD_A_nn(registers: Registers, mmu: Mmu) : Instruction(registers, mmu) {

    private var value = 0
    override val totalCycles = 16

    override fun reset() {
        super.reset()
        value = 0
    }

    override fun tick() {
        when(currentCycle) {
            0 -> {

            }
            4 -> {
                value = getImmediate()
            }
            8 -> {
                value = setSecondByte(value, getImmediate())
            }
            12 -> {
                registers.A = mmu.readByte(value)
            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}