package cz.nurmuedu.namo_reservation_system.Model;

import cz.nurmuedu.namo_reservation_system.Model.User.Client;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private Integer maxSessions;
    private Integer SessionsLeft;
    private Integer price;
    private String currency;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
}
