package cz.nurmuedu.namo_reservation_system.controller;

import cz.nurmuedu.namo_reservation_system.model.Session;
import cz.nurmuedu.namo_reservation_system.service.SessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getUpcomingSessions")
    public ResponseEntity<Session> getUpcomingSessions() {
        return sessionService.getUpcomingSessions();
    }

    @GetMapping("/getUserSessions")
    public ResponseEntity<Session> getUserSessions(@RequestBody String tgUsername) {
        return sessionService.getUserSessions(tgUsername);
    }

}
