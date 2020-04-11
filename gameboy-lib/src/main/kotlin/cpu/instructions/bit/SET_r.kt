package cpu.instructions.bit

import cpu.RegisterID
import cpu.Registers
import cpu.instructions.Instruction
import memory.Mmu
import utils.Log
import utils.setBit

class SET_r(registers: Registers, mmu: Mmu, private val register: Int, private val index: Int) : Instruction(registers, mmu) {

    override val totalCycles = 8

    override fun tick() {
        when(currentCycle) {
            0 -> {

            }
            4 -> {
                when(register) {
                    RegisterID.A.ordinal -> registers.A = setBit(registers.A, index)
                    RegisterID.B.ordinal -> registers.B = setBit(registers.B, index)
                    RegisterID.C.ordinal -> registers.C = setBit(registers.C, index)
                    RegisterID.D.ordinal -> registers.D = setBit(registers.D, index)
                    RegisterID.E.ordinal -> registers.E = setBit(registers.E, index)
                    RegisterID.H.ordinal -> registers.H = setBit(registers.H, index)
                    RegisterID.L.ordinal -> registers.L = setBit(registers.L, index)
                    else -> throw Exception("Invalid register: $register")
                }
            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}