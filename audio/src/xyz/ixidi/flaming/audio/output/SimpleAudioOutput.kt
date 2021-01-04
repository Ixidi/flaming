package xyz.ixidi.flaming.audio.output

import javax.sound.sampled.AudioFormat
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.DataLine
import javax.sound.sampled.SourceDataLine

class SimpleAudioOutput(
    audioFormat: AudioFormat
): AudioOutput {

    private val dataLine = AudioSystem.getLine(DataLine.Info(SourceDataLine::class.java, audioFormat)) as SourceDataLine

    init {
        dataLine.open(audioFormat)
        dataLine.start()
    }

    override fun write(bytes: ByteArray?) {
        if (bytes == null) return

        dataLine.write(bytes, 0, bytes.size)
    }

    override fun close() {
        if (dataLine.isOpen) close()
    }

}