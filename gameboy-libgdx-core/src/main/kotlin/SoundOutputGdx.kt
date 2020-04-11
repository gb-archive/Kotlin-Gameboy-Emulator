import com.badlogic.gdx.Gdx
import com.badlogic.gdx.audio.AudioDevice
import com.badlogic.gdx.utils.GdxRuntimeException
import memory.io.sound.SoundOutput

class SoundOutputGdx : SoundOutput {

    private val SAMPLE_RATE = 22050
    private val BUFFER_SIZE = 512

    private val device : AudioDevice? = try {
        Gdx.audio.newAudioDevice(SAMPLE_RATE, false)
    } catch (e: GdxRuntimeException) {
        null
    }

    private var counter = 0
    private var divider = GameBoy.TICKS_PER_SEC / SAMPLE_RATE
    private var bufferIndex = 0
    private val buffer = ShortArray(BUFFER_SIZE)

    override fun reset() {

    }

    override fun play(left: Byte, right: Byte) {
        if (device == null) {
            return
        }

        if (counter++ != 0) {
            counter %= divider
            return
        }

        buffer[bufferIndex++] = (left * 255).toShort()
        buffer[bufferIndex++] = (right * 255).toShort()

        if (bufferIndex >= BUFFER_SIZE) {
            //val lol = System.currentTimeMillis()
            device.writeSamples(buffer, 0, buffer.size)
            //Log.d("${System.currentTimeMillis() - lol}")
            bufferIndex = 0
        }
    }

    fun dispose() {
        device?.dispose()
    }
}