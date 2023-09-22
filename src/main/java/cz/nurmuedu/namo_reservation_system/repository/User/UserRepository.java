package cz.nurmuedu.namo_reservation_system.repository.User;
import cz.nurmuedu.namo_reservation_system.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
