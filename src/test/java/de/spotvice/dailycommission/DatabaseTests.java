package de.spotvice.dailycommission;

import de.spotvice.dailycommission.colleague.Colleague;
import de.spotvice.dailycommission.colleague.ColleagueRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.ws.rs.core.Application;

import static org.junit.Assert.assertEquals;

/**
 * For testing with actual database: @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class DatabaseTests {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Inject
    ColleagueRepository repository;

    @Test
    public void saveToRepository() {
        repository.save(new Colleague("Arsentos", "Miglyn"));
        repository.save(new Colleague("Tomatos", "Hard"));
        repository.save(new Colleague("Dobias", "Pom"));
        repository.save(new Colleague("Boerdi", "Voght"));
        repository.save(new Colleague("Dueclos", "Prinz aus Kamerun"));

        assertEquals(5, repository.findAll().size());
    }
}
