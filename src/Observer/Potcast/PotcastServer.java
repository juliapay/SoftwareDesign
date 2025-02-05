package Observer.Potcast;

import java.util.ArrayList;
import java.util.List;

public class PotcastServer {

    private List<Potcast> potcastList;
    private List<PotcastPlayer> clients;


    public PotcastServer() {
        this.potcastList = new ArrayList<>();
        this.clients=new ArrayList<>();
    }
    public void addPotcastAbonnent(PotcastPlayer player){
        clients.add(player);
    }

    public void addPotcast(Potcast potcast){
        potcastList.add(potcast);
    }
    public void notifyPotcastAbonnent(Potcast potcast) {
        for (PotcastPlayer thisClient : clients) {
            thisClient.update(potcast);
        }

    }
}
