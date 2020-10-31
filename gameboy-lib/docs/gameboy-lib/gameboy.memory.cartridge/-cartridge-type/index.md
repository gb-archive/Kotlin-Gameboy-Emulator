---
title: CartridgeType -
---
//[gameboy-lib](../../index.md)/[gameboy.memory.cartridge](../index.md)/[CartridgeType](index.md)



# CartridgeType  
 [jvm] interface [CartridgeType](index.md) : [Memory](../../gameboy.memory/-memory/index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/loadRam/#java.io.File/PointingToDeclaration/"></a>[loadRam](load-ram.md)| <a name="gameboy.memory.cartridge/CartridgeType/loadRam/#java.io.File/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [loadRam](load-ram.md)(file: [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html))  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/loadRom/#kotlin.ByteArray/PointingToDeclaration/"></a>[loadRom](load-rom.md)| <a name="gameboy.memory.cartridge/CartridgeType/loadRom/#kotlin.ByteArray/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [loadRom](load-rom.md)(value: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html))  <br>More info  <br>Loads cartridge ROM into this.  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/readByte/#kotlin.Int/PointingToDeclaration/"></a>[readByte](read-byte.md)| <a name="gameboy.memory.cartridge/CartridgeType/readByte/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [readByte](read-byte.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Reads an 8-bit value at address  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/readRam/#kotlin.Int/PointingToDeclaration/"></a>[readRam](read-ram.md)| <a name="gameboy.memory.cartridge/CartridgeType/readRam/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [readRam](read-ram.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Read RAM at location address  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/readRom/#kotlin.Int/PointingToDeclaration/"></a>[readRom](read-rom.md)| <a name="gameboy.memory.cartridge/CartridgeType/readRom/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [readRom](read-rom.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Read ROM at location address  <br><br><br>
| <a name="gameboy.memory/Memory/readWord/#kotlin.Int/PointingToDeclaration/"></a>[readWord](../../gameboy.memory/-memory/read-word.md)| <a name="gameboy.memory/Memory/readWord/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [readWord](../../gameboy.memory/-memory/read-word.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Reads a 16-bit value at address  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/reset/#/PointingToDeclaration/"></a>[reset](reset.md)| <a name="gameboy.memory.cartridge/CartridgeType/reset/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [reset](reset.md)()  <br>More info  <br>Resets each memory address to their default value  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/saveRam/#java.io.File/PointingToDeclaration/"></a>[saveRam](save-ram.md)| <a name="gameboy.memory.cartridge/CartridgeType/saveRam/#java.io.File/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [saveRam](save-ram.md)(file: [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html))  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="gameboy.memory.cartridge/CartridgeType/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/writeByte/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[writeByte](write-byte.md)| <a name="gameboy.memory.cartridge/CartridgeType/writeByte/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [writeByte](write-byte.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Writes an 8-bit value to address  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/writeRam/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[writeRam](write-ram.md)| <a name="gameboy.memory.cartridge/CartridgeType/writeRam/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [writeRam](write-ram.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Write value to RAM at location address  <br><br><br>
| <a name="gameboy.memory.cartridge/CartridgeType/writeRom/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[writeRom](write-rom.md)| <a name="gameboy.memory.cartridge/CartridgeType/writeRom/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>abstract fun [writeRom](write-rom.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Write value to ROM at location address  <br><br><br>
| <a name="gameboy.memory/Memory/writeWord/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[writeWord](../../gameboy.memory/-memory/write-word.md)| <a name="gameboy.memory/Memory/writeWord/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [writeWord](../../gameboy.memory/-memory/write-word.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Writes an 8-bit value to address  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="gameboy.memory.cartridge/CartridgeType/ram/#/PointingToDeclaration/"></a>[ram](ram.md)| <a name="gameboy.memory.cartridge/CartridgeType/ram/#/PointingToDeclaration/"></a> [jvm] abstract val [ram](ram.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)>?An array of RAM banks   <br>
| <a name="gameboy.memory.cartridge/CartridgeType/rom/#/PointingToDeclaration/"></a>[rom](rom.md)| <a name="gameboy.memory.cartridge/CartridgeType/rom/#/PointingToDeclaration/"></a> [jvm] abstract val [rom](rom.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)>An array of ROM banks   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="gameboy.memory.cartridge/MBC///PointingToDeclaration/"></a>[MBC](../-m-b-c/index.md)
| <a name="gameboy.memory.cartridge/ROMONLY///PointingToDeclaration/"></a>[ROMONLY](../-r-o-m-o-n-l-y/index.md)

