package com.example.Api.WorldHappines;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class WorldHappinessService {
    private final WorldHappinessRepository worldHappinessRepository;
    @Autowired
    public WorldHappinessService(WorldHappinessRepository worldHappinessRepository) {
        this.worldHappinessRepository = worldHappinessRepository;
    }

    public List<Worldhappiness> getCountries() {
        return this.worldHappinessRepository.findAll();
    }

    public Optional<Worldhappiness> getCountryById(long id) {
        return this.worldHappinessRepository.findById(id);
    }

    public void addCountry(Worldhappiness worldhappiness) throws AlreadyExistException {
        boolean exist = this.worldHappinessRepository.existsById(worldhappiness.getId());
        if(exist)
        {
            throw new AlreadyExistException();
        }else
        {
            this.worldHappinessRepository.save(worldhappiness);
        }
    }

    public void deleteSpecificCountry(long id) throws DoesNotExistException {
        boolean exist = this.worldHappinessRepository.existsById(id);
        if(exist)
        {
            this.worldHappinessRepository.delete(this.worldHappinessRepository.getById(id));
        }else
        {
            throw new DoesNotExistException();
        }
    }
    @Transactional
    public void updateCountry(long id, String country, String region) throws DoesNotExistException {
        if(country.length() > 0 && region.length() > 0)
        {
            boolean doesExist = this.worldHappinessRepository.existsById(id);
            if(doesExist)
            {
                Worldhappiness happinessCountry = this.worldHappinessRepository.getById(id);
                happinessCountry.setCountry(country);
                happinessCountry.setRegion(region);
            }else
            {
                throw new DoesNotExistException();
            }
        }
    }
}
