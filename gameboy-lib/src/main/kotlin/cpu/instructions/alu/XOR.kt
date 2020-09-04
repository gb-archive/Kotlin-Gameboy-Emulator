package cpu.instructions.alu

import cpu.Registers
import cpu.instructions.Instruction
import memory.Mmu

abstract class XOR(registers: Registers, mmu: Mmu) : Instruction(registers, mmu) {

    protected var value = 0

    override fun reset() {
        super.reset()
        value = 0
    }

    protected fun xor(value: Int) {
        registers.A = registers.A xor value

        val zFlag = registers.A == 0
        registers.setZFlag(zFlag)

        registers.setNFlag(false)
        registers.setCFlag(false)
        registers.setHFlag(false)
    }
}