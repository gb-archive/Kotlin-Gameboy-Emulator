package nl.stanroelofs.gameboy.cpu.instructions.alu

import nl.stanroelofs.gameboy.cpu.Registers
import nl.stanroelofs.gameboy.cpu.instructions.Instruction
import nl.stanroelofs.gameboy.memory.Mmu

abstract class AND(registers: Registers, mmu: Mmu) : Instruction(registers, mmu) {

    protected var value = 0

    override fun reset() {
        super.reset()
        value = 0
    }

    protected fun and(value: Int) {
        registers.A = registers.A and value

        val zFlag = registers.A == 0
        registers.setZFlag(zFlag)

        registers.setNFlag(false)
        registers.setCFlag(false)
        registers.setHFlag(true)
    }
}