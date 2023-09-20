package cz.nurmuedu.namo_reservation_system.Model;

import cz.nurmuedu.namo_reservation_system.Model.User.Client;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Integer amount;
    private String currency;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
