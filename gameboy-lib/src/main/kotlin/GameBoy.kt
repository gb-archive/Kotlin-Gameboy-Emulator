package gameboy

import cpu.Cpu
import memory.Mmu
import memory.cartridge.Cartridge
import java.io.File

/**
 * Main Gameboy class
 *
 * Implements the Runnable interface such that it can be ran in a thread
 * Optionally a file is passed which will be loaded as a cartridge
 */
class GameBoy(cart: File? = null) : Runnable {

    companion object {
        /** The number of ticks per second the CPU is supposed to execute */
        const val TICKS_PER_SEC = 4194304 / 4
    }

    /** The Gameboy's MMU instance */
    val mmu = Mmu()

    /** The Gameboy's CPU instance */
    val cpu = Cpu(mmu)

    /** The current cartridge / rom */
    var cartridge: Cartridge? = null

    /** Indicates whether the gameboy is currently running or not */
    var running = false
        private set

    /** Indicates whether the gameboy is paused or not */
    var paused = false

    init {
        reset()

        if (cart != null) {
            loadCartridge(cart)
        }
    }

    /** Resets all registers and memory addresses */
    fun reset() {
        mmu.reset()
        cpu.reset()
    }

    /** Performs a single cpu step */
    fun step() {
        cpu.step()
    }

    /** Toggle pause on / off */
    fun togglePause() {
        paused = !paused
    }

    /** Stop running */
    fun stop() {
        running = false
    }

    override fun run() {
        running = true
        while (running) {
            if (!paused) {
                step()
            }
        }
    }

    /**
     * Loads a rom into the gameboy
     * @param cart A .gb file which should be loaded
     */
    fun loadCartridge(cart: File) {
        cartridge = Cartridge(cart)
        mmu.cartridge = cartridge
        reset()
    }
}