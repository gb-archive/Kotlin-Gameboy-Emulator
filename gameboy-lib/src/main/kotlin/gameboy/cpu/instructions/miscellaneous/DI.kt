package gameboy.cpu.instructions.miscellaneous

import gameboy.cpu.Registers
import gameboy.cpu.instructions.Instruction
import gameboy.memory.Mmu

class DI(registers: Registers, mmu: Mmu) : Instruction(registers, mmu) {

    override val totalCycles = 4

    override fun tick() {
        when(currentCycle) {
            0 -> {
                registers.IME = false
                registers.eiExecuted = false // Clear this flag in case EI was executed last cycle
            }
            else -> throw IllegalStateException("Invalid cycle count: $currentCycle")
        }

        currentCycle += 4
    }
}