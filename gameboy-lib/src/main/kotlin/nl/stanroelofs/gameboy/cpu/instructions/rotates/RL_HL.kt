package nl.stanroelofs.gameboy.cpu.instructions.rotates

import nl.stanroelofs.gameboy.cpu.Registers
import nl.stanroelofs.gameboy.memory.Mmu

class RL_HL(registers: Registers, mmu: Mmu) : RL(registers, mmu) {

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

            }
            8 -> {
                address = registers.HL
                value = mmu.readByte(address)
            }
            12 -> {
                mmu.writeByte(address, rl(value))
            }
            else -> throw IllegalStateException("Invalid cycle count: $currentCycle")
        }

        currentCycle += 4
    }
}