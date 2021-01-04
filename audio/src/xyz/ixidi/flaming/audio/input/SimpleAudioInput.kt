package xyz.ixidi.flaming.audio.input

import javax.sound.sampled.AudioFormat
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.DataLine
import javax.sound.sampled.TargetDataLine

class SimpleAudioInput(
    audioFormat: AudioFormat
): AudioInput {

    private val dataLine = AudioSystem.getLine(DataLine.Info(TargetDataLine::class.java, audioFormat)) as TargetDataLine

    init {
        dataLine.open(audioFormat)
        dataLine.start()
    }

    override fun read(max: Int): ByteArray {
        val buff = ByteArray(max)
        dataLine.read(buff, 0, buff.size)
        return buff
    }

    override fun close() {
        if (dataLine.isOpen) close()
    }

}