package de.spotvice.testproject.testartifact;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Thomas Engelhard
 */
public interface ColleagueRepository extends JpaRepository<Colleague, UUID> {
    List<Colleague> findByFirstName(String firstName);

    List<Colleague> findByLastName(String lastName);
}
