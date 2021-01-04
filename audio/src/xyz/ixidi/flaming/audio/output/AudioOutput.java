package xyz.ixidi.flaming.audio.output;

public interface AudioOutput {

    void write(byte[] bytes);
    void close();

}
