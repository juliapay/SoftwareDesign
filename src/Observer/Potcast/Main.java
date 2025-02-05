package Observer.Potcast;

public class Main {
    public static void main(String[] args) {
        PotcastServer potcastServer =new PotcastServer();

        Potcast potcast1= new Potcast("Three","https:/Liu.Cixin.com", 123.56d);
        Potcast potcast2= new Potcast("Body","https:/Liu.Cixin.com", 2345.78d);
        Potcast potcast3= new Potcast("Problem","https:/Liu.Cixin.com", 3456.78d);

    PotcastPlayer noteb= new NoteBook("Lem", potcastServer);
    PotcastPlayer smartw= new SmartWatch("Dick", potcastServer);
    PotcastPlayer smartp= new SmartPhone("Strugatzki", potcastServer);
    
    potcastServer.notifyPotcastAbonnent(potcast1);
    potcastServer.notifyPotcastAbonnent(potcast2);
    potcastServer.notifyPotcastAbonnent(potcast3);


    }
}
