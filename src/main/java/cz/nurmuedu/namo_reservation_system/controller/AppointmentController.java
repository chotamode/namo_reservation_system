package cz.nurmuedu.namo_reservation_system.controller;

import cz.nurmuedu.namo_reservation_system.model.Appointment;
import cz.nurmuedu.namo_reservation_system.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    //Create appointment using clientId and sessionId
    @PostMapping("/make")
    public Appointment makeAppointment(@RequestParam Long clientId,@RequestParam Long sessionId) {
        return appointmentService.createAppointmentByIds(clientId, sessionId);
    }

}
