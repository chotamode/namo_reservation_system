package cz.nurmuedu.namo_reservation_system.controller;

import cz.nurmuedu.namo_reservation_system.model.User.Client;
import cz.nurmuedu.namo_reservation_system.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/createRandomClient")
    public void createRandomClient() {
        String randomName = "Name" + (int) (Math.random() * 100);
        Client client = new Client("TgUsername", randomName, "Sur", "Em", "Ph");
        clientService.saveClient(client);
    }

    @DeleteMapping("/deleteClientById/{id}")
    public void deleteClientById(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        clientService.deleteClient(client);
    }

    @GetMapping("/findClientById/{id}")
    public Client findClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/findAllClients")
    public Iterable<Client> findAllClients() {
        return clientService.findAllClients();
    }
}
