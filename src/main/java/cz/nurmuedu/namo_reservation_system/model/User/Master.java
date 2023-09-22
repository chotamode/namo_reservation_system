package cz.nurmuedu.namo_reservation_system.model.User;

import jakarta.persistence.Entity;

@Entity
public class Master extends User {
    public Master(String tgUsername, String name, String surname, String email, String phone) {
        super(tgUsername, name, surname, email, phone);
    }

    public Master() {

    }
}
