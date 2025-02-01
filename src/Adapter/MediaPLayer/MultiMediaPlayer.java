package Adapter.MediaPLayer;

import java.util.HashMap;
import java.util.Map;

public class MultiMediaPlayer {
    private Map<String, IPlayer> players = new HashMap<>();


    public MultiMediaPlayer() {
    }

    public void registerFormat(String format, IPlayer player) {
        players.put(format.toLowerCase(), player);
    }

    public void play(String format, String file) {

        IPlayer player = players.get(format.toLowerCase());
        if (player != null) {
            player.play(file);
        } else {
            System.out.println("Format not supported: " + format);
        }

    }
}
