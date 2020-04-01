package blargg

import org.junit.Test

internal class MemTiming2Tests : BlarggTest() {

    override val path = "mem_timing-2/rom_singles"
    override val method = ValidateMethod.MEMORY

    @Test
    fun test1() {
        runBlarggTest("01-read_timing.gb")
    }

    @Test
    fun test2() {
        runBlarggTest("02-write_timing.gb")
    }

    @Test
    fun test3() {
        runBlarggTest("03-modify_timing.gb")
    }
}