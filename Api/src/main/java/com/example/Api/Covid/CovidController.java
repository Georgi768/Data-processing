package com.example.Api.Covid;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import com.example.Api.VideoGames.Videogames;
import com.example.Api.XmlJsonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "api/covid")
public class CovidController extends XmlJsonValidator {
    private final CovidService covidService;

    @Autowired
    public CovidController(CovidService covidService) {
        this.covidService = covidService;
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Covid19> getAllCovidElementsWithJson() {
        return this.covidService.getAllCases();
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Covid19> getAllCovidElementsWithXML() {
        return this.covidService.getAllCases();
    }

    @GetMapping(path = "json/{Id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Covid19> getCovidCountryByIdJson(@PathVariable("Id") long id) throws DoesNotExistException {
        return this.covidService.getCountryById(id);
    }

    @GetMapping(path = "xml/{Id}", produces = MediaType.APPLICATION_XML_VALUE)
    public Optional<Covid19> getCovidCountryByIdXML(@PathVariable("Id") long id) throws DoesNotExistException {
        return this.covidService.getCountryById(id);
    }

    @GetMapping(path = "/xml/name=/{name}" , produces = MediaType.APPLICATION_XML_VALUE)
    public List<Covid19> getCountryByNameInXml(@PathVariable("name") String countryName)
    {
        return this.covidService.getCovidCountry(countryName);
    }
    @GetMapping(path = "/json/name=/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Covid19> getCountryByNameInJSON(@PathVariable("name") String countryName)
    {
        return this.covidService.getCovidCountry(countryName);
    }


    @PostMapping
    public void addNewCountry(@RequestBody Covid19 covid19) throws AlreadyExistException {
        if (this.validateJson(this,covid19, "Schemas/CoronaVirusSchema.JSON")) {
            this.covidService.addNewCovidCountryCase(covid19);
        }
    }

    @DeleteMapping(path = "{Id}")
    public void deleteCountry(@PathVariable("Id") long id) throws DoesNotExistException {
        this.covidService.deleteCovidCountry(id);
    }

    @PutMapping(path = "{Id}")
    public void updateCountry(@PathVariable("Id") long id, @RequestParam(required = false) String name, @RequestParam(required = false) String region) throws AlreadyExistException {
        this.covidService.updateCountryNameAndRegion(id, name, region);
    }

}
