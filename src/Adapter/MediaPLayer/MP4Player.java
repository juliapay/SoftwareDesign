package Adapter.MediaPLayer;

public class MP4Player implements IPlayer{
    @Override
    public void play(String file) {
        System.out.println("Playing MP4 file: " + file);
    }
}
