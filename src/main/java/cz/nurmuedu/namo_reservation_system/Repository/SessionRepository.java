package cz.nurmuedu.namo_reservation_system.Repository;

import cz.nurmuedu.namo_reservation_system.Model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
