package cz.nurmuedu.namo_reservation_system.Repository.User;
import cz.nurmuedu.namo_reservation_system.Model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
