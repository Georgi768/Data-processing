package com.example.Api.VideoGames;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoGamesRepository extends JpaRepository<Videogames,Long> {
        Optional<Videogames> findVideogamesByName(String name);

        @Query("SELECT v FROM Videogames v WHERE  v.countrywhereproduced = ?1")
        List<Videogames> findAllVideoGamesBycountrywhereproduced(String country);

}
