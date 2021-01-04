package xyz.ixidi.flaming.audio.input;

public interface AudioInput {

    byte[] read(int max);
    void close();

}
