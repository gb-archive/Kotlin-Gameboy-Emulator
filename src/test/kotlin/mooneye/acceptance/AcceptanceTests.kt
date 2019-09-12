package mooneye.acceptance

import mooneye.MooneyeTest
import org.junit.Test

class AcceptanceTests : MooneyeTest() {

    override val path = "acceptance"

    /*
    @Test
    fun add_sp_e_timing() {
        runMooneyeTest("add_sp_e_timing.gb", 0)
    }

    @Test
    fun boot_div_dmgABC() {
        val gb = GameBoy(File("${path}boot_div-dmgABCmgb.gb"))
        runMooneyeTest(gb, 0)
    }*/

    @Test
    fun boot_hwio_dmgABC() {
        runMooneyeTest("boot_hwio-dmgABCmgb.gb", -1059871625)
    }

    @Test
    fun boot_regs_dmgABC() {
        runMooneyeTest("boot_regs-dmgABC.gb", 2030127056)
    }

    /*
    @Test
    fun call_cc_timing() {
        val gb = GameBoy(File("${path}call_cc_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun call_cc_timing2() {
        val gb = GameBoy(File("${path}call_cc_timing2.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun call_timing() {
        val gb = GameBoy(File("${path}call_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun call_timing2() {
        val gb = GameBoy(File("${path}call_timing2.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun di_timing_GS() {
        val gb = GameBoy(File("${path}di_timing-GS.gb"))
        runMooneyeTest(gb, 0)
    }*/

    @Test
    fun div_timing() {
        runMooneyeTest("div_timing.gb", 618563916)
    }

    /*
    @Test
    fun ei_sequence() {
        val gb = GameBoy(File("${path}ei_sequence.gb"))
        runMooneyeTest(gb, 0)
    }*/

    @Test
    fun ei_timing() {
        runMooneyeTest("ei_timing.gb", -2097771431)
    }

    @Test
    fun halt_ime0_ei() {
        runMooneyeTest("halt_ime0_ei.gb", -1059871625)
    }

    @Test
    fun halt_ime0_nointr_timing() {
        runMooneyeTest("halt_ime0_nointr_timing.gb", 427613825)
    }

    @Test
    fun halt_ime1_timing() {
        runMooneyeTest("halt_ime1_timing.gb", -769890694)
    }

    /*
    @Test
    fun halt_ime1_timing2_GS() {
        val gb = GameBoy(File("${path}halt_ime1_timing2-GS.gb"))
        runMooneyeTest(gb, 0)
    }*/

    @Test
    fun if_ie_registers() {
        runMooneyeTest("if_ie_registers.gb", 1747996174)
    }

    /*
    @Test
    fun intr_timing() {
        val gb = GameBoy(File("${path}intr_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun jp_cc_timing() {
        val gb = GameBoy(File("${path}jp_cc_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun jp_timing() {
        val gb = GameBoy(File("${path}jp_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun ld_hl_sp_e_timing() {
        val gb = GameBoy(File("${path}ld_hl_sp_e_timing.gb"))
        runMooneyeTest(gb, 0)
    }
*/
    @Test
    fun oam_dma_restart() {
        runMooneyeTest("oam_dma_restart.gb", 1906711267)
    }

    @Test
    fun oam_dma_start() {
        runMooneyeTest("oam_dma_start.gb", -2065568537)
    }

    @Test
    fun oam_dma_timing() {
        runMooneyeTest("oam_dma_timing.gb", 1906711267)
    }

    /*
    @Test
    fun pop_timing() {
        val gb = GameBoy(File("${path}pop_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun push_timing() {
        val gb = GameBoy(File("${path}push_timing.gb"))
        runMooneyeTest(gb, 0)
    }*/

    @Test
    fun rapid_di_ei() {
        runMooneyeTest("rapid_di_ei.gb", 978629457)
    }

    /*
    @Test
    fun ret_cc_timing() {
        val gb = GameBoy(File("${path}ret_cc_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun ret_timing() {
        val gb = GameBoy(File("${path}ret_timing.gb"))
        runMooneyeTest(gb, 0)
    }*/

    @Test
    fun reti_intr_timing() {
        runMooneyeTest("reti_intr_timing.gb", 1502539589)
    }

    /*
    @Test
    fun reti_timing() {
        val gb = GameBoy(File("${path}reti_timing.gb"))
        runMooneyeTest(gb, 0)
    }

    @Test
    fun rst_timing() {
        val gb = GameBoy(File("${path}rst_timing.gb"))
        runMooneyeTest(gb, 0)
    }*/
}