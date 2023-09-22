package cz.nurmuedu.namo_reservation_system.repository.User;

import cz.nurmuedu.namo_reservation_system.model.User.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByTgUsername(String tgUsername);
}
