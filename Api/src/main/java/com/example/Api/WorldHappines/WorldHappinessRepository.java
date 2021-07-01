package com.example.Api.WorldHappines;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorldHappinessRepository extends JpaRepository<Worldhappiness,Long> {

   // Optional<Worldhappiness> getWorldhappinessesByhappiness_rank(int rank);
}
