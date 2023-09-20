package cz.nurmuedu.namo_reservation_system.Model;

import cz.nurmuedu.namo_reservation_system.Model.User.Client;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String masterName;
    private Date dateAndTime;
    private Integer duration;
    private Integer price;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Integer maxClients;
    private Integer currentClients;
    private String location;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client[] clients;
}

enum Status {
    PLANNED,
    CANCELED,
    FULL,
    GOING,
    DONE
}
