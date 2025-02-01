package Adapter.MediaPLayer;

public class MpegPlayer implements IPlayer{
    @Override
    public void play(String file) {
        System.out.println("Playing MPEG file: " + file);
    }
}
