---
title: Joypad -
---
//[gameboy-lib](../../index.md)/[gameboy.memory.io](../index.md)/[Joypad](index.md)



# Joypad  
 [jvm] class [Joypad](index.md)(**mmu**: [Mmu](../../gameboy.memory/-mmu/index.md)) : [Memory](../../gameboy.memory/-memory/index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="gameboy.memory.io/Joypad.JoypadKey///PointingToDeclaration/"></a>[JoypadKey](-joypad-key/index.md)| <a name="gameboy.memory.io/Joypad.JoypadKey///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>enum [JoypadKey](-joypad-key/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Joypad.JoypadKey](-joypad-key/index.md)>   <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="gameboy.memory.io/Joypad/keyPressed/#gameboy.memory.io.Joypad.JoypadKey/PointingToDeclaration/"></a>[keyPressed](key-pressed.md)| <a name="gameboy.memory.io/Joypad/keyPressed/#gameboy.memory.io.Joypad.JoypadKey/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [keyPressed](key-pressed.md)(key: [Joypad.JoypadKey](-joypad-key/index.md))  <br><br><br>
| <a name="gameboy.memory.io/Joypad/keyReleased/#gameboy.memory.io.Joypad.JoypadKey/PointingToDeclaration/"></a>[keyReleased](key-released.md)| <a name="gameboy.memory.io/Joypad/keyReleased/#gameboy.memory.io.Joypad.JoypadKey/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [keyReleased](key-released.md)(key: [Joypad.JoypadKey](-joypad-key/index.md))  <br><br><br>
| <a name="gameboy.memory.io/Joypad/readByte/#kotlin.Int/PointingToDeclaration/"></a>[readByte](read-byte.md)| <a name="gameboy.memory.io/Joypad/readByte/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [readByte](read-byte.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Reads an 8-bit value at address  <br><br><br>
| <a name="gameboy.memory/Memory/readWord/#kotlin.Int/PointingToDeclaration/"></a>[readWord](../../gameboy.memory/-memory/read-word.md)| <a name="gameboy.memory/Memory/readWord/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [readWord](../../gameboy.memory/-memory/read-word.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Reads a 16-bit value at address  <br><br><br>
| <a name="gameboy.memory.io/Joypad/reset/#/PointingToDeclaration/"></a>[reset](reset.md)| <a name="gameboy.memory.io/Joypad/reset/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [reset](reset.md)()  <br>More info  <br>Resets each memory address to their default value  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../gameboy.utils/-log/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F456262920)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="gameboy.memory.io/Joypad/writeByte/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[writeByte](write-byte.md)| <a name="gameboy.memory.io/Joypad/writeByte/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [writeByte](write-byte.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Writes an 8-bit value to address  <br><br><br>
| <a name="gameboy.memory/Memory/writeWord/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[writeWord](../../gameboy.memory/-memory/write-word.md)| <a name="gameboy.memory/Memory/writeWord/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [writeWord](../../gameboy.memory/-memory/write-word.md)(address: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Writes an 8-bit value to address  <br><br><br>

