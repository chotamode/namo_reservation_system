package cz.nurmuedu.namo_reservation_system.repository;

import cz.nurmuedu.namo_reservation_system.model.Appointment;
import cz.nurmuedu.namo_reservation_system.model.Session;
import cz.nurmuedu.namo_reservation_system.model.User.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    Appointment findByClientAndSession(Client client1, Session sessionWithoutClients);
}
