package cz.nurmuedu.namo_reservation_system.Model.User;

import jakarta.persistence.Entity;

@Entity
public class Client extends User {
    public Client(String tgUsername, String name, String surname, String email, String phone) {
        super(tgUsername, name, surname, email, phone);
    }

    public Client() {

    }
}
