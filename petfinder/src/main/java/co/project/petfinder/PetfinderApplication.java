package co.project.petfinder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.project.petfinder.model.repository.reporterRepository;

@SpringBootApplication
public class PetfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetfinderApplication.class, args);
	}
}

