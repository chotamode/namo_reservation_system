package cz.nurmuedu.namo_reservation_system.Service;

import cz.nurmuedu.namo_reservation_system.Model.User.Client;
import cz.nurmuedu.namo_reservation_system.Repository.User.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    public Iterable<Client> findAllClients() {
        return clientRepository.findAll();
    }
}
