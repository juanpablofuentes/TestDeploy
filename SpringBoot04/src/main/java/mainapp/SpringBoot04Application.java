package mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// Esta anotación nos dice donde buscar los controladores
@ComponentScan("com.trifulcas")
// Esta donde buscar las entidades
@EntityScan("com.trifulcas.models")
// Donde buscar los repositorios
@EnableJpaRepositories("com.trifulcas.repository")
public class SpringBoot04Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04Application.class, args);
	}

}
