package cz.nurmuedu.namo_reservation_system.service;

import cz.nurmuedu.namo_reservation_system.model.Appointment;
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

    public Appointment createAppointment(Long clientId, Long sessionId) {
        Appointment appointment = new Appointment();
        appointment.setClient(clientService.getClientById(clientId));
        appointment.setSession(sessionService.getSessionById(sessionId));
        return appointmentRepository.save(appointment);
    }
}
