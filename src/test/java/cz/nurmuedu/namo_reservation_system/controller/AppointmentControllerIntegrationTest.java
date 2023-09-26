package cz.nurmuedu.namo_reservation_system.controller;

import cz.nurmuedu.namo_reservation_system.model.Session;
import cz.nurmuedu.namo_reservation_system.model.Status;
import cz.nurmuedu.namo_reservation_system.model.User.Client;
import cz.nurmuedu.namo_reservation_system.repository.AppointmentRepository;
import cz.nurmuedu.namo_reservation_system.repository.SessionRepository;
import cz.nurmuedu.namo_reservation_system.repository.User.ClientRepository;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class AppointmentControllerIntegrationTest {

    @Autowired
    private AppointmentController appointmentController;

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private MockMvc mockMvc;

    //Creating test data Appointment, Client, Session
    Client client1 = new Client("tgUsername1",
            "name1",
            "surname1",
            "email1",
            "phone1"
    );
    Client client2 = new Client("tgUsername2",
            "name2",
            "surname2",
            "email2",
            "phone2"
    );
    Session sessionWithoutClients = new Session(
            "masterName",
            LocalDateTime.of(LocalDate.of(2023, 9, 25), LocalTime.of(12, 0)),
            1.5f,
            400f,
            "description",
            Status.PLANNED,
            10,
            0,
            "location 45/34, 123 45 Prague"
    );
    Session sessionFull = new Session(
            "masterName",
            LocalDateTime.of(LocalDate.of(2023, 9, 26), LocalTime.of(12, 0)),
            1.5f,
            400f,
            "description",
            Status.FULL,
            10,
            10,
            "location 45/34, 123 45 Prague"
    );

    @BeforeEach
    public void setUp() {
        client1 = clientRepository.save(client1);
        client2 = clientRepository.save(client2);
        sessionWithoutClients = sessionRepository.save(sessionWithoutClients);
        sessionFull = sessionRepository.save(sessionFull);
    }

    @AfterEach
    public void tearDown() {
        appointmentRepository.deleteAll();
        clientRepository.deleteAll();
        sessionRepository.deleteAll();
    }

    @Test
    public void userMakesAppointmentToSessionWithoutClients() throws Exception {
        //Send request to make appointment
        mockMvc.perform(post("/appointment/make")
                .param("clientId", client1.getId().toString())
                .param("sessionId", sessionWithoutClients.getId().toString())
        );

        //Check if appointment was created and saved to database
        assert appointmentRepository.findByClientAndSession(client1, sessionWithoutClients) != null;
    }

    @Test
    public void userMakesAppointmentToSessionFull() throws Exception {
        //Send request to make appointment
        mockMvc.perform(post("/appointment/make")
                .param("clientId", client1.getId().toString())
                .param("sessionId", sessionFull.getId().toString())
        );

        //Check if appointment was not created and not saved to database
        assert appointmentRepository.findByClientAndSession(client1, sessionFull) == null;
    }
}