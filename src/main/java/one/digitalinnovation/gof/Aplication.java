package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * projeto Spring boot gerado via Spring Initializr.
 * Os seguintes modulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 database
 * - OpenFeign
 */
// http://localhost:8080/swagger-ui/index.html#/

@SpringBootApplication
@EnableFeignClients
public class Aplication {

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}

}
