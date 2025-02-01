package Adapter.DucksAndTurkeys;

public class BigTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println(" Big Turkey Gobbles");
    }

    @Override
    public void fly() {
        System.out.println(" Big Turkey is walking");
    }
}
