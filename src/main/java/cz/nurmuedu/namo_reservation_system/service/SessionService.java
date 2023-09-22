package cz.nurmuedu.namo_reservation_system.service;

import cz.nurmuedu.namo_reservation_system.model.Session;
import cz.nurmuedu.namo_reservation_system.repository.SessionRepository;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    private final SessionRepository sessionRepository;

    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public Session getSessionById(Long sessionId) {
        return sessionRepository.findById(sessionId).orElseThrow();
    }
}
