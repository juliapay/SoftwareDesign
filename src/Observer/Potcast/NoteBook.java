package Observer.Potcast;

public class NoteBook implements PotcastPlayer{
public String name;
public PotcastServer potcastServer;

    public NoteBook(String name, PotcastServer potcastServer) {
        this.name = name;
        this.potcastServer = potcastServer;
        this.potcastServer.addPotcastAbonnent(this);
    }

    @Override
    public void update(Potcast potcast) {
        System.out.println("NoteBook "+ name + " hat einen neuen Potcast erhalten: "+potcast.getName());

    }

    @Override
    public String getName() {
        return name;
    }
}
