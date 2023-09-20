package cz.nurmuedu.namo_reservation_system;

import cz.nurmuedu.namo_reservation_system.Model.User.Client;
import cz.nurmuedu.namo_reservation_system.Model.User.User;
import cz.nurmuedu.namo_reservation_system.Repository.User.ClientRepository;
import cz.nurmuedu.namo_reservation_system.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NamoReservationSystemApplication {

//	private static UserService userService = null;
//	private static ClientRepository clientRepository = null;
//	static Logger logger = LoggerFactory.getLogger(NamoReservationSystemApplication.class);

//	public NamoReservationSystemApplication(UserService userService, ClientRepository clientRepository) {
//		NamoReservationSystemApplication.userService = userService;
//		NamoReservationSystemApplication.clientRepository = clientRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(NamoReservationSystemApplication.class, args);
//		Client testclient = new Client("test", "test", "test", "test", "test");
//		userService.saveUser(testclient);
//		logger.info("testclient saved");
//		logger.info("testclient id: " + testclient.getId());
//		Client testclient = clientRepository.findById(1L).orElse(null);
//		clientRepository.delete(testclient);
//		logger.info("testclient deleted");
	}

}
