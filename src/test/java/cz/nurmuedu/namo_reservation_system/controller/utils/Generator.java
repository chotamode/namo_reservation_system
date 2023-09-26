package cz.nurmuedu.namo_reservation_system.controller.utils;

import cz.nurmuedu.namo_reservation_system.model.User.Client;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    //Generate n random clients
    public static List<Client> generateClients(int n) {
        List<Client> clients = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Client client = new Client("tgUsername" + i,
                    "name" + i,
                    "surname" + i,
                    "email" + i,
                    "phone" + i
            );
            clients.add(client);
        }

        return clients;
    }

}
