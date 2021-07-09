package com.example.Api.WorldHappines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorldHappinessRepository extends JpaRepository<Worldhappiness,Long> {

   // Optional<Worldhappiness> getWorldhappinessesByhappiness_rank(int rank);

    @Query("SELECT w FROM Worldhappiness w WHERE  w.country = ?1")
    List<Worldhappiness> findCountryBycountry(String country);
}
