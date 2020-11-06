package gameboy.memory

import gameboy.memory.cartridge.Cartridge
import gameboy.memory.io.IO
import gameboy.utils.setBit

abstract class Mmu(val cartridge: Cartridge) : Memory {

    companion object {
        // Constants

        // LCD
        const val SVBK = 0xFF70
        const val VBK = 0xFF4F
        const val LCDC = 0xFF40
        const val LY = 0xFF44
        const val LYC = 0xFF45
        const val STAT = 0xFF41
        const val SCY = 0xFF42
        const val SCX = 0xFF43
        const val WY = 0xFF4A
        const val WX = 0xFF4B
        const val BGP = 0xFF47
        const val OBP0 = 0xFF48
        const val OBP1 = 0xFF49
        const val BCPS = 0xFF68
        const val BCPD = 0xFF69
        const val OCPS = 0xFF6A
        const val OCPD = 0xFF6B

        // Interrupts
        const val IF = 0xFF0F
        const val IE = 0xFFFF

        // Timer
        const val DIV = 0xFF04
        const val TIMA = 0xFF05
        const val TMA = 0xFF06
        const val TAC = 0xFF07

        // Joypad
        const val P1 = 0xFF00

        // Serial
        const val SB = 0xFF01
        const val SC = 0xFF02

        // DMA
        const val DMA = 0xFF46
        const val HDMA1 = 0xFF51
        const val HDMA2 = 0xFF52
        const val HDMA3 = 0xFF53
        const val HDMA4 = 0xFF54
        const val HDMA5 = 0xFF55

        // Sound
        const val NR10 = 0xFF10
        const val NR11 = 0xFF11
        const val NR12 = 0xFF12
        const val NR13 = 0xFF13
        const val NR14 = 0xFF14

        const val NR21 = 0xFF16
        const val NR22 = 0xFF17
        const val NR23 = 0xFF18
        const val NR24 = 0xFF19

        const val NR30 = 0xFF1A
        const val NR31 = 0xFF1B
        const val NR32 = 0xFF1C
        const val NR33 = 0xFF1D
        const val NR34 = 0xFF1E

        const val NR41 = 0xFF20
        const val NR42 = 0xFF21
        const val NR43 = 0xFF22
        const val NR44 = 0xFF23

        const val NR50 = 0xFF24
        const val NR51 = 0xFF25
        const val NR52 = 0xFF26

        // CGB
        const val KEY1 = 0xFF4D
        const val RP = 0xFF56
    }

    internal abstract val hram : HRam
    internal abstract val internalRam : InternalRam
    internal abstract val oam : Oam
    abstract val io : IO

    final override fun reset() {
        hram.reset()
        oam.reset()
        internalRam.reset()
        io.reset()
        cartridge.reset()
    }

    internal fun tick(cycles: Int) {
        io.tick(cycles)
    }

    /**
     * Sets the bit at [pos] to true in the Interrupt Flags register
     */
    fun requestInterrupt(pos: Int) {
        var interruptFlags = readByte(IF)
        interruptFlags = setBit(interruptFlags, pos)
        writeByte(IF, interruptFlags)
    }

    /*
     * Used to read during DMA transfer, standard readByte prevents this as memory is not accessible
     * during DMA
     */
    internal abstract fun dmaReadByte(address: Int): Int

    /*
     * Used to write DMA transfer, standard writeByte prevents this as memory is not accessible
     * during DMA
     */
    internal abstract fun dmaWriteByte(address: Int, value: Int)
}
