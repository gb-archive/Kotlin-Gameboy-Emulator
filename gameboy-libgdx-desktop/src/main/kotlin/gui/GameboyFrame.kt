package gui

import GameboyDesktop
import com.badlogic.gdx.backends.lwjgl.LwjglAWTCanvas
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import gameboy.GameBoy
import gameboy.GameBoyCGB
import gameboy.GameBoyDMG
import gameboy.memory.cartridge.Cartridge
import gameboy.utils.Log
import java.awt.BorderLayout
import java.awt.Dimension
import java.io.File
import javax.swing.*

class GameboyFrame : JFrame() {

    private lateinit var gb: GameBoy
    private val gbapp = GameboyDesktop()
    private val romChooser: RomChooser

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
        romChooser = RomChooser()

        val container = contentPane
        container.layout = BorderLayout()

        val cfg = LwjglApplicationConfiguration()
        cfg.title = "Gameboy"
        cfg.width = 160 * 3
        cfg.height = 144 * 3
        val canvas = LwjglAWTCanvas(gbapp, cfg)
        container.add(canvas.canvas, BorderLayout.CENTER)

        val menuBar = JMenuBar()
        val fileMenu = JMenu("File")
        //fileMenu.mnemonic = KeyEvent.VK_ALT
        val loadRom = JMenuItem("Load rom")
        loadRom.addActionListener {loadRom() }
        fileMenu.add(loadRom)
        menuBar.add(fileMenu)

        val gameMenu = JMenu("Game")
        val reset = JMenuItem("Reset")
        reset.addActionListener { reset() }
        gameMenu.add(reset)
        val pause = JMenuItem("Toggle pause")
        pause.addActionListener { togglePause() }
        gameMenu.add(pause)
        val save = JMenuItem("Save")
        save.addActionListener { save() }
        gameMenu.add(save)
        val load = JMenuItem("Load")
        load.addActionListener { load() }
        gameMenu.add(load)
        menuBar.add(gameMenu)

        jMenuBar = menuBar

        container.preferredSize = Dimension(cfg.width, cfg.height)
        pack()
        isVisible = true
    }

    private fun loadRom() {
        val romFile = romChooser.chooseRom(this) ?: return
        val cartridge = Cartridge(romFile)
        if (cartridge.type == null)
            return

        gb = if (cartridge.isGbc) GameBoyCGB(cartridge) else GameBoyDMG(cartridge)

        if (cartridge.type!!.hasBattery())
            load()

        gbapp.startgb(gb)
    }

    private fun togglePause() {
        gb.togglePause()
    }

    private fun reset() {
        gb.reset()
    }

    private fun save() {
        val fileName = gb.mmu.cartridge.cartridgeFile.nameWithoutExtension
        try {
            gb.mmu.cartridge.saveRam(File("$fileName.sav"))
        } catch (e: Exception) {
            when (e) {
                is IllegalStateException -> Log.e("Failed to save RAM: $e")
                else -> throw e
            }
        }
    }

    private fun load() {
        val fileName = gb.mmu.cartridge.cartridgeFile.nameWithoutExtension
        val file = File("$fileName.sav")
        if (!file.exists())
            return

        try {
            gb.mmu.cartridge.loadRam(File("$fileName.sav"))
        } catch (e: Exception) {
            when (e) {
                is IllegalStateException, is IllegalArgumentException -> Log.e("Failed to load RAM: $e")
                else -> throw e
            }
        }
    }
}