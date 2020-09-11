package gameboy.cpu.instructions.alu

import gameboy.cpu.RegisterID
import gameboy.cpu.Registers
import gameboy.memory.Mmu
import gameboy.utils.Log

class CP_A_r(registers: Registers, mmu: Mmu, private val register: Int) : CP(registers, mmu) {

    override val totalCycles = 4

    override fun tick() {

        when(currentCycle) {
            0 -> {
                value = when(register) {
                    RegisterID.A.ordinal -> registers.A
                    RegisterID.B.ordinal -> registers.B
                    RegisterID.C.ordinal -> registers.C
                    RegisterID.D.ordinal -> registers.D
                    RegisterID.E.ordinal -> registers.E
                    RegisterID.H.ordinal -> registers.H
                    RegisterID.L.ordinal -> registers.L
                    else -> throw Exception("Invalid register: $register")
                }
                cp(value)
            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}