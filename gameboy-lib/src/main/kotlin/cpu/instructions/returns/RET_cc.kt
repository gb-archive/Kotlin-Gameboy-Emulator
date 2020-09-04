package cpu.instructions.returns

import cpu.Registers
import cpu.instructions.Instruction
import memory.Mmu
import utils.Log
import utils.setSecondByte

class RET_cc(registers: Registers, mmu: Mmu, private val flag: Int, private val state: Boolean) : Instruction(registers, mmu) {

    private var value = 0
    private var conditionHolds = true
    override val totalCycles = 20

    override fun reset() {
        super.reset()
        value = 0
        conditionHolds = true
    }

    override fun tick() {
        when(currentCycle) {
            0 -> {

            }
            4 -> {
                if (!(flag == registers.ZFlag && state && registers.getZFlag()) &&
                        !(flag == registers.ZFlag && !state && !registers.getZFlag()) &&
                        !(flag == registers.CFlag && state && registers.getCFlag()) &&
                        !(flag == registers.CFlag && !state && !registers.getCFlag())) {
                    conditionHolds = false
                }
            }
            8 -> {
                if (conditionHolds) {
                    value = popFromStack()
                }
            }
            12 -> {
                if (conditionHolds) {
                    value = setSecondByte(value, popFromStack())
                }
            }
            16 -> {
                if (conditionHolds) {
                    registers.PC = value
                }
            }
            else -> Log.e("Invalid state")
        }

        currentCycle += 4
    }

    override fun isExecuting(): Boolean {
        if ((!conditionHolds && currentCycle == 8) || (conditionHolds && currentCycle == totalCycles)) {
            return false
        }
        return true
    }
}