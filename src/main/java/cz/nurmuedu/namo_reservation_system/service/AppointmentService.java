package cz.nurmuedu.namo_reservation_system.service;

import cz.nurmuedu.namo_reservation_system.exception.SessionException;
import cz.nurmuedu.namo_reservation_system.model.Appointment;
import cz.nurmuedu.namo_reservation_system.model.Session;
import cz.nurmuedu.namo_reservation_system.model.Status;
import cz.nurmuedu.namo_reservation_system.model.User.Client;
import cz.nurmuedu.namo_reservation_system.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final ClientService clientService;
    private final SessionService sessionService;

    public AppointmentService(AppointmentRepository appointmentRepository, ClientService clientService, SessionService sessionService) {
        this.appointmentRepository = appointmentRepository;
        this.clientService = clientService;
        this.sessionService = sessionService;
    }


    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment createAppointmentByIds(Long clientId, Long sessionId) throws SessionException {
        Session session = sessionService.getSessionById(sessionId);

        sessionService.addClientToSession(session, clientService.getClientById(clientId));

        Appointment appointment = new Appointment();
        appointment.setClient(clientService.getClientById(clientId));
        appointment.setSession(sessionService.getSessionById(sessionId));
        return appointmentRepository.save(appointment);
    }
}
