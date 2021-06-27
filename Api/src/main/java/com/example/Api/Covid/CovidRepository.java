package com.example.Api.Covid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CovidRepository extends JpaRepository<Covid19, Long> {

    Optional<Covid19> findCovid19ByCountry(String country);

}
