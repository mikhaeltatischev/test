package library.rents;

import library.realizable.Client;
import library.realizable.Product;

import java.util.HashMap;

public class RentManager {
    private HashMap<Client, String> accounting = new HashMap<>();

    public void rent(Client client, Product product) {
        if (!product.getRented()) {
            accounting.put(client, product.getName());
            product.setRented(true);
        } else {
            System.out.println("Книга уже сдана");
        }
    }

    public void passBook(Client client, Product product) {
        accounting.remove(client, product);
        System.out.println("Книга сдана");
    }

    public void search(String name) {
        for(Client client : accounting.keySet()) {
            if (client.getName().equals(name)) {
                System.out.println("Клиент " + name + " взял книгу " + accounting.get(client));
            } else System.out.println("У клиента нет не одной книги");
        }
    }
}
