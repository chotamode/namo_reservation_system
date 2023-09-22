package cz.nurmuedu.namo_reservation_system.model;

import cz.nurmuedu.namo_reservation_system.model.User.Client;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    private String masterName;

    @NonNull
    private LocalDateTime dateAndTime;

    @NonNull
    private Float duration;

    @NonNull
    private Float price;

    @NonNull
    private String description;

    @NonNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NonNull
    private Integer maxClients;

    @NonNull
    private Integer currentClients;

    @NonNull
    private String location;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client[] clients;


}

