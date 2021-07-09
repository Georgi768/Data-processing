package com.example.Api.WorldHappines;

import com.example.Api.Covid.Covid19;
import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import com.example.Api.XmlJsonValidator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.networknt.schema.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path = "api/happiness")
public class WorldHappinessController extends XmlJsonValidator {
    private final WorldHappinessService worldHappinessService;

    @Autowired
    public WorldHappinessController(WorldHappinessService worldHappinessService) {
        this.worldHappinessService = worldHappinessService;
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Worldhappiness> getAllCountiesJson() {
        return this.worldHappinessService.getCountries();
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Worldhappiness> getAllCountiesXML() {
        return this.worldHappinessService.getCountries();
    }

    @GetMapping(path = "json/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Worldhappiness> getSpecificCountryJson(@PathVariable("id") long id) {
        return this.worldHappinessService.getCountryById(id);
    }

    @GetMapping(path = "xml/{id}", produces = MediaType.APPLICATION_XML_VALUE)
    public Optional<Worldhappiness> getSpecificCountryXML(@PathVariable("id") long id) {
        return this.worldHappinessService.getCountryById(id);
    }
    @GetMapping(path = "/xml/name=/{name}" , produces = MediaType.APPLICATION_XML_VALUE)
    public List<Worldhappiness> getCountryByNameInXml(@PathVariable("name") String countryName)
    {
        return this.worldHappinessService.getHappinessCountry(countryName);
    }
    @GetMapping(path = "/json/name=/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Worldhappiness> getCountryByNameInJSON(@PathVariable("name") String countryName)
    {
        return this.worldHappinessService.getHappinessCountry(countryName);
    }
    @PostMapping
    public void addNewCountry(@RequestBody Worldhappiness worldhappiness) throws AlreadyExistException {
        if(this.validateJson(this,worldhappiness,"Schemas/HappinessJSONSchema.JSON"))
        {
            this.worldHappinessService.addCountry(worldhappiness);
        }
    }

    @DeleteMapping(path = "delete/{id}")
    public void deleteCountry(@PathVariable("id") long id) throws DoesNotExistException {
        this.worldHappinessService.deleteSpecificCountry(id);
    }

    @PutMapping(path = "updates/{id}")
    public void updateCountryDetails(@PathVariable("id") long id, String country, String region) throws DoesNotExistException {
        this.worldHappinessService.updateCountry(id, country, region);
    }

}
