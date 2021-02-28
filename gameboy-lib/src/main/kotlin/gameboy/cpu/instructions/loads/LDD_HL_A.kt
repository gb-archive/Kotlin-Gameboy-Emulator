package gameboy.cpu.instructions.loads

import gameboy.cpu.Registers
import gameboy.cpu.instructions.Instruction
import gameboy.memory.Mmu

class LDD_HL_A(registers: Registers, mmu: Mmu) : Instruction(registers, mmu) {

    override val totalCycles = 8

    override fun tick() {
        when(currentCycle) {
            0 -> {

            }
            4 -> {
                val HL = registers.getHL()
                registers.setHL(HL - 1)

                mmu.writeByte(HL, registers.A)
            }
            else -> throw IllegalStateException("Invalid cycle count: $currentCycle")
        }

        currentCycle += 4
    }
}