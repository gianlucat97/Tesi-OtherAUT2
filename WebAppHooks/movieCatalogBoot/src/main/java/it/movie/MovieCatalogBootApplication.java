package it.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="it.movie.repository")
public class MovieCatalogBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogBootApplication.class, args);
	}

}
