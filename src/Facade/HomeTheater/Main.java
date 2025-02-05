package Facade.HomeTheater;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(new TV(),new SoundSystem(),new BlueRayPlayer());

        homeTheaterFacade.startMovie();
        homeTheaterFacade.stopMovie();
    }
}
