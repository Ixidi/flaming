package xyz.ixidi.flaming.audio

import xyz.ixidi.flaming.audio.input.AudioInput
import xyz.ixidi.flaming.audio.input.SimpleAudioInput
import xyz.ixidi.flaming.audio.output.AudioOutput
import xyz.ixidi.flaming.audio.output.SimpleAudioOutput
import javax.sound.sampled.AudioFormat

class SimpleAudioManager : AudioManager {

    private companion object {
        val AUDIO_FORMAT = AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100f, 16, 2, 4, 44100f, true)
    }

    override fun openOutput(): AudioOutput = SimpleAudioOutput(AUDIO_FORMAT)

    override fun openInput(): AudioInput = SimpleAudioInput(AUDIO_FORMAT)
}