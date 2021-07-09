package com.example.Api.Covid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CovidRepository extends JpaRepository<Covid19, Long> {

    Optional<Covid19> findCovid19Bycountry(String country);

    @Query("SELECT c FROM Covid19 c WHERE  c.country = ?1")
    List<Covid19> findAllByCountry(String country);
}
