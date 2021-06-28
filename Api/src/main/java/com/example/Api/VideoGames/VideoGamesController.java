package com.example.Api.VideoGames;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/VideoGames")
public class VideoGamesController {
    private final VideoGamesService videoGamesService;

    @Autowired
    public VideoGamesController(VideoGamesService videoGamesService) {
        this.videoGamesService = videoGamesService;
    }
    @GetMapping
    public List<Videogames> getVideoGames()
    {
       return this.videoGamesService.getAllVideoGames();
    }
    @GetMapping(path = "{id}")
    public Optional<Videogames> getVideoGameById(@PathVariable("id") long id) throws DoesNotExistException {
        return this.videoGamesService.getGameById(id);
    }
    @PostMapping
    public void addNewCountry(@RequestBody Videogames videogames) throws AlreadyExistException {
        this.videoGamesService.createCountry(videogames);
    }
}
