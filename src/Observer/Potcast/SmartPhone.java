package Observer.Potcast;

public class SmartPhone implements PotcastPlayer{
public String name;
public PotcastServer potcastServer;

    public SmartPhone(String name, PotcastServer potcastServer) {
        this.name = name;
        this.potcastServer = potcastServer;
        this.potcastServer.addPotcastAbonnent(this);
    }

    @Override
    public void update(Potcast potcast) {
        System.out.println("SmartPhone "+ name + " hat einen neuen Potcast erhalten: "+potcast.getName());

    }

    @Override
    public String getName() {
        return name;
    }
}
