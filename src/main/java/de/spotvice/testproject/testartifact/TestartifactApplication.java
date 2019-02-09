package de.spotvice.testproject.testartifact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.ws.rs.core.Application;

@SpringBootApplication
public class TestartifactApplication {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(TestartifactApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ColleagueRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Colleague("Arsentos", "Miglyn"));
            repository.save(new Colleague("Tomatos", "Hard"));
            repository.save(new Colleague("Dobias", "Pom"));
            repository.save(new Colleague("Boerdi", "Voght"));
            repository.save(new Colleague("Dueclos", "Prinz aus Kamerun"));

            // fetch all customers
            log.info("Colleague found with findAll():");
            log.info("-------------------------------");

            for (Colleague colleague : repository.findAll()) {
                log.info(colleague.toString());
            }

            log.info("");

            // fetch an individual customer by ID
            repository.findByFirstName("Dobias")
                    .forEach(colleague -> {
                        log.info("Colleague found with findByFirstName(\"Dobias\"):");
                        log.info("--------------------------------");
                        log.info(colleague.toString());
                        log.info("");
                    });

            log.info("");
        };
    }
}