package devkaimovies.MoviesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class MoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}


	//	#Simple Connect to localhost:8080 to check connection to server
	//	@GetMapping("/")
	//	public String apiRoot(){
	//		return "Hello from Java!!!";
	//	}

}
