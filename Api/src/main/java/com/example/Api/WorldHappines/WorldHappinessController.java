package com.example.Api.WorldHappines;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/happiness")
public class WorldHappinessController {
    private final WorldHappinessService worldHappinessService;

    @Autowired
    public WorldHappinessController(WorldHappinessService worldHappinessService) {
        this.worldHappinessService = worldHappinessService;
    }
    @GetMapping
    public List<Worldhappiness> getAllCounties()
    {
        return this.worldHappinessService.getCountries();
    }

    @GetMapping(path = "{id}")
    public Optional<Worldhappiness> getSpecificCountry(@PathVariable("id") long id)
    {
        return this.worldHappinessService.getCountryById(id);
    }
    @PostMapping
    public void addNewCountry(@RequestBody Worldhappiness worldhappiness) throws AlreadyExistException {
        this.worldHappinessService.addCountry(worldhappiness);
    }
    @DeleteMapping(path = "delete/{id}")
    public void deleteCountry(@PathVariable("id") long id) throws DoesNotExistException {
        this.worldHappinessService.deleteSpecificCountry(id);
    }
    @PutMapping(path = "updates/{id}")
    public void updateCountryDetails(@PathVariable("id") long id,String country,String region) throws DoesNotExistException {
        this.worldHappinessService.updateCountry(id,country,region);
    }

}
