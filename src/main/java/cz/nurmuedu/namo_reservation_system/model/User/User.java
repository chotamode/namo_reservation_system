package cz.nurmuedu.namo_reservation_system.model.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    //Username from Telegram should be unique
    @Column(name = "tg_username", nullable = false, unique = true)
    private String tgUsername;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public User(String tgUsername, String name, String surname, String email, String phone) {
        this.tgUsername = tgUsername;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public User() {
    }
}

