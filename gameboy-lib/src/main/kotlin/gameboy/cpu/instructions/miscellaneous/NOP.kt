package gameboy.cpu.instructions.miscellaneous

import gameboy.cpu.Registers
import gameboy.cpu.instructions.Instruction
import gameboy.memory.Mmu

class NOP(registers: Registers, mmu: Mmu) : Instruction(registers, mmu) {

    override val totalCycles = 4

    override fun tick() {
        when(currentCycle) {
            0 -> {

            }
            else -> throw IllegalStateException("Invalid cycle count: $currentCycle")
        }

        currentCycle += 4
    }
}