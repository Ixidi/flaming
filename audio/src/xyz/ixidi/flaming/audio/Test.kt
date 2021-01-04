package xyz.ixidi.flaming.audio

fun main() {
    val output = SimpleAudioManager().openOutput()
    val input = SimpleAudioManager().openInput()
    while (true) {
        val tempBuffer = input.read(2048)
        output.write(tempBuffer)
    }
}