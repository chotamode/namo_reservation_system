package cz.nurmuedu.namo_reservation_system.service;

import cz.nurmuedu.namo_reservation_system.exception.SessionException;
import cz.nurmuedu.namo_reservation_system.model.Session;
import cz.nurmuedu.namo_reservation_system.model.Status;
import cz.nurmuedu.namo_reservation_system.model.User.Client;
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

    //Creating new session
    public Session createSession(Session session) {
        return sessionRepository.save(session);
    }

    public Session addClientToSession(Session session, Client client) {
        if(session.getClients().size() >= session.getMaxClients() || session.getStatus().equals(Status.FULL)) {
            throw new SessionException("Session is full");
        }
        //if user already has appointment in this session throw exception
        if(session.getClients().contains(client)) {
            throw new SessionException("Client already has appointment in this session");
        }

        session.getClients().add(client);
        session.setCurrentClients(session.getCurrentClients() + 1);
        if(session.getClients().size() >= session.getMaxClients()) {
            session.setStatus(Status.FULL);
        }
        return sessionRepository.save(session);
    }
}
