package Observer.ObserverPatternPotcast;

public interface PotcastPlayer {

    //wenn der PotcastServer leinen neuen Potcast heraus bringt wird erhalte() aufgerufen

    public void erhalte(Potcast potcast);

    public String getName();

}
