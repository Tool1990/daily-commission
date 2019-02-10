package de.spotvice.dailycommission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyCommissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyCommissionApplication.class, args);
    }

    /* Adding dummy data to database
    @Bean
    public boolean createTestData(ColleagueRepository repository) {
            repository.save(new Colleague("Arsentos", "Miglyn"));
            repository.save(new Colleague("Tomatos", "Hard"));
            repository.save(new Colleague("Dobias", "Pom"));
            repository.save(new Colleague("Boerdi", "Voght"));
            repository.save(new Colleague("Dueclos", "Prinz aus Kamerun"));
            return true;
    }*/
}
