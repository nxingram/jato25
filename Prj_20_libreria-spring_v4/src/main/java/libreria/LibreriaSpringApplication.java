package libreria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "libreria")
public class LibreriaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaSpringApplication.class, args);
	}

}
