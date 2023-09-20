package cz.nurmuedu.namo_reservation_system.Service;

import cz.nurmuedu.namo_reservation_system.Model.User.User;
import cz.nurmuedu.namo_reservation_system.Repository.User.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
