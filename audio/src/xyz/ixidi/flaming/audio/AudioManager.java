package xyz.ixidi.flaming.audio;

import xyz.ixidi.flaming.audio.input.AudioInput;
import xyz.ixidi.flaming.audio.output.AudioOutput;

public interface AudioManager {

    AudioOutput openOutput();
    AudioInput openInput();

}
