package de.spotvice.dailycommission.colleague;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ColleagueRepository extends JpaRepository<Colleague, UUID> {
    List<Colleague> findByFirstName(String firstName);

    @Cacheable()
    List<Colleague> findByLastName(String lastName);
}
