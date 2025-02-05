package Adapter.MultiMediaPlayer;

import java.util.HashMap;
import java.util.Map;

public class MultiMediaPlayer {
private IPlayer iPlayer;
    private Map<String, IPlayer> playerMap = new HashMap<>();

    public MultiMediaPlayer() {

    }

    public void registerFormat(String format, IPlayer iPlayer) {
        playerMap.put(format, iPlayer);
    }

    public void play(String format, String file) {

        IPlayer player = playerMap.get(format.toLowerCase());
        player.play(file);
    }
}
