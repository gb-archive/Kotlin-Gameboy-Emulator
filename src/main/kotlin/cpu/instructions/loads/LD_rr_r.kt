package cpu.instructions.loads

import cpu.RegisterID
import cpu.Registers
import cpu.instructions.Instruction
import memory.Mmu
import utils.Log

class LD_rr_r(registers: Registers, mmu: Mmu, private val register1: Int, private val register2: Int) : Instruction(registers, mmu) {

    override val totalCycles = 8

    override fun tick() {

        when(currentCycle) {
            0 -> {
                val value = when(register2) {
                    RegisterID.A.ordinal -> registers.A
                    RegisterID.B.ordinal -> registers.B
                    RegisterID.C.ordinal -> registers.C
                    RegisterID.D.ordinal -> registers.D
                    RegisterID.E.ordinal -> registers.E
                    RegisterID.H.ordinal -> registers.H
                    RegisterID.L.ordinal -> registers.L
                    else -> throw Exception("Invalid register: $register2")
                }

                when(register1) {
                    RegisterID.BC.ordinal -> mmu.writeByte(registers.getBC(), value)
                    RegisterID.DE.ordinal -> mmu.writeByte(registers.getDE(), value)
                    RegisterID.HL.ordinal -> mmu.writeByte(registers.getHL(), value)
                    else -> throw Exception("Invalid register: $register1")
                }
            }
            4 -> {

            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }
}