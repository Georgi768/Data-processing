package com.example.Api.Covid;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/covid")
public class CovidController {
    private final CovidService covidService;
    @Autowired
    public CovidController(CovidService covidService) {
        this.covidService = covidService;
    }

    @GetMapping
    public List<Covid19> getAllCovidElements()
    {
        return this.covidService.getAllCases();
    }

    @GetMapping(path = "{Id}")
    public Optional<Covid19> getCovidCountryById(@PathVariable("Id") long id) throws DoesNotExistException {
       return this.covidService.getCountryById(id);
    }
    @PostMapping
    public void addNewCountry(@RequestBody Covid19 covid19) throws AlreadyExistException {
        this.covidService.addNewCovidCountryCase(covid19);
    }
    @DeleteMapping(path = "{Id}")
    public void deleteCountry(@PathVariable("Id") long id) throws DoesNotExistException {
        this.covidService.deleteCovidCountry(id);
    }
    @PutMapping(path = "{Id}")
    public void updateCountry(@PathVariable("Id") long id,@RequestParam(required = false) String name,@RequestParam(required = false) String region) throws AlreadyExistException {
        this.covidService.updateCountryNameAndRegion(id,name,region);
    }

}
