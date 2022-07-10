package azurehello1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Azurehello1Application {
	
	@GetMapping("/message")
	public String message() {
		return "hello, siddhant";
	}

	public static void main(String[] args) {
		SpringApplication.run(Azurehello1Application.class, args);
	}

}
