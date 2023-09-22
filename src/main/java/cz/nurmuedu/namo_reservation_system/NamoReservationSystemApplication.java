package cz.nurmuedu.namo_reservation_system;

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
