package cz.nurmuedu.namo_reservation_system.model.User;

import cz.nurmuedu.namo_reservation_system.model.Session;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Client extends User {

    public Client(String tgUsername, String name, String surname, String email, String phone) {
        super(tgUsername, name, surname, email, phone);
    }

    public Client() {

    }
}
