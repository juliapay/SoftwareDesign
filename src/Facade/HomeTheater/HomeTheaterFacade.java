package Facade.HomeTheater;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private BlueRayPlayer blueRayPlayer;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, BlueRayPlayer blueRayPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.blueRayPlayer = blueRayPlayer;
    }

    public void startMovie(){
        tv.tvOn();
        soundSystem.soundSystemOn();
        blueRayPlayer.blueRayPlayerOn();
    }
    public void stopMovie(){
        tv.tvOff();
        soundSystem.soundSystemOff();
        blueRayPlayer.blueRayPlayerOff();
    }
}
