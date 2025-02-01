package Adapter.DucksAndTurkeys;

public class Mallard implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Quacks");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Flies");

    }
}
