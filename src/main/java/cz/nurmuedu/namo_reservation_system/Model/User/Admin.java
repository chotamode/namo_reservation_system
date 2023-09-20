package cz.nurmuedu.namo_reservation_system.Model.User;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
    public Admin(String tgUsername, String name, String surname, String email, String phone) {
        super(tgUsername, name, surname, email, phone);
    }

    public Admin() {

    }
}
