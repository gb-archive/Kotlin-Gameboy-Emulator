package memory.io.sound

import memory.Mmu

class SquareWave1 : SquareWave() {

    private val frequencySweep = FrequencySweep()

    init {
        reset()
    }

    override fun reset() {
        super.reset()
        duty = 0b10
        volumeEnvelope.setNr2(0xF3)
        enabled = true
        frequencySweep.reset()
    }

    override fun tick(cycles: Int): Int {
        val wasEnabled = frequencySweep.enabled
        frequencySweep.tick()
        if (wasEnabled && !frequencySweep.enabled) {
            enabled = false
        }
        return super.tick(cycles)
    }

    override fun readByte(address: Int): Int {
        return when (address) {
            Mmu.NR10 -> frequencySweep.getNr10()
            else -> super.readByte(address)
        }
    }

    override fun writeByte(address: Int, value: Int) {
        val newVal = value and 0xFF

        when (address) {
            Mmu.NR10 -> frequencySweep.setNr10(newVal)
            Mmu.NR13 -> frequencySweep.setNr13(newVal)
            Mmu.NR14 -> {
                frequencySweep.setNr14(newVal)
                super.writeByte(address, newVal)
            }
            else -> super.writeByte(address, newVal)
        }
    }

    override fun getFrequency(): Int {
        return frequencySweep.getFrequency()
    }

    override fun trigger() {
        super.trigger()

        frequencySweep.trigger()
        if (!frequencySweep.enabled) {
           // enabled = false
        }
    }
}