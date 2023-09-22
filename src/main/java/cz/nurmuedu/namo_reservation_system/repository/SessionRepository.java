package cz.nurmuedu.namo_reservation_system.repository;

import cz.nurmuedu.namo_reservation_system.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
