package Adapter.MediaPLayer;

public class Main {
    public static void main(String[] args) {
        // MultiMediaPlayer instanziieren
        MultiMediaPlayer mediaPlayer = new MultiMediaPlayer();

        // Formate und Player registrieren
        mediaPlayer.registerFormat("mpeg", new MpegPlayer());
        mediaPlayer.registerFormat("mp4", new MP4Player());

        // Dateien abspielen
        mediaPlayer.play("mpeg", "movie1.mpeg");
        mediaPlayer.play("mp4", "video1.mp4");

        // Nicht unterstütztes Format
        mediaPlayer.play("avi", "video2.avi");
    }
}

