package com.example.Api.VideoGames;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoGamesRepository extends JpaRepository<Videogames,Long> {
        Optional<Videogames> findVideogamesByName(String name);

}
