package cz.nurmuedu.namo_reservation_system.Repository.User;

import cz.nurmuedu.namo_reservation_system.Model.User.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
