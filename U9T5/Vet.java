import java.util.ArrayList;

public class Vet {
    ArrayList<Animal> clients;
    String vetName;

    public Vet(String vetName) {
        clients = new ArrayList<>();
        this.vetName = vetName;
    }

    public boolean addClient(Animal client) {
        if (!clients.contains(client)) {
            clients.add(client);
            System.out.println("Welcome to " + vetName + "'s office, " + client.getName());
            return true;
        }
        System.out.println(client.getName() + " is already a client of " + vetName);
        return false;
    }

    public void printClientList() {
        for (Animal animal : clients) {
            System.out.println(animal.getName() + ": " + animal.getClass());
        }
    }
}
