package cz.nurmuedu.namo_reservation_system.controller;

import cz.nurmuedu.namo_reservation_system.model.Session;
import cz.nurmuedu.namo_reservation_system.service.SessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {

    private final SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    //Creating new session using data from JSON body of POST request
    @PostMapping("/createSession")
    public ResponseEntity<Session> createSession(@RequestBody Session session) {
        sessionService.createSession(session);
        return ResponseEntity.ok(session);
    }
}
