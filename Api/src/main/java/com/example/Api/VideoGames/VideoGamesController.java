package com.example.Api.VideoGames;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import com.example.Api.XmlJsonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/VideoGames")
public class VideoGamesController extends XmlJsonValidator{
    private final VideoGamesService videoGamesService;

    @Autowired
    public VideoGamesController(VideoGamesService videoGamesService) {
        this.videoGamesService = videoGamesService;
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Videogames> getVideoGamesJson() {
        return this.videoGamesService.getAllVideoGames();
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Videogames> getVideoGamesJsonXML() {
        return this.videoGamesService.getAllVideoGames();
    }

    @GetMapping(path = "/json/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Videogames> getVideoGameByIdJson(@PathVariable("id") long id) throws DoesNotExistException {
        return this.videoGamesService.getGameById(id);
    }

    @GetMapping(path = "/xml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
        public Optional<Videogames> getVideoGameByIdXML(@PathVariable("id") long id) throws DoesNotExistException {
        return this.videoGamesService.getGameById(id);
    }

    @GetMapping(path = "/xml/name=/{name}" , produces = MediaType.APPLICATION_XML_VALUE)
    public List<Videogames> getVideoGameByCountryInXml(@PathVariable("name") String countryName)
    {
       return this.videoGamesService.getCountryByName(countryName);
    }
    @GetMapping(path = "/json/name=/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Videogames> getVideoGameByCountryInJson(@PathVariable("name") String countryName)
    {
        return this.videoGamesService.getCountryByName(countryName);
    }

    @PostMapping
    public void addNewGame(@RequestBody Videogames videogames) throws AlreadyExistException{
        if(this.validateJson(this,videogames,"Schemas/VideoGameSales.JSON"))
        this.videoGamesService.createGame(videogames);

    }

    @DeleteMapping(path = "deletion/{id}")
    public void deleteGame(@PathVariable("id") long id) throws DoesNotExistException {
        this.videoGamesService.deleteGameById(id);
    }

    @PutMapping(path = "{id}")
    public void updateGame(@PathVariable("id") long id, @RequestParam(required = false) String country, @RequestParam(required = false) String name) throws DoesNotExistException {
        this.videoGamesService.updateVideoGameContent(id, country, name);
    }
}
