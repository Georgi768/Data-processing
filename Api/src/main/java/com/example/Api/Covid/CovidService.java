package com.example.Api.Covid;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CovidService {
    private final CovidRepository covidRepository;

    @Autowired
    public CovidService(CovidRepository covidRepository) {
        this.covidRepository = covidRepository;
    }

    public List<Covid19> getAllCases() {
        return this.covidRepository.findAll();
    }

    public Optional<Covid19> getCountryById(long id) throws DoesNotExistException {
        boolean doesExist = this.covidRepository.existsById(id);
        if (doesExist) {
            return this.covidRepository.findById(id);
        } else {
            throw new DoesNotExistException();
        }
    }

    public void addNewCovidCountryCase(Covid19 covid19) throws AlreadyExistException {
        Optional<Covid19> country = this.covidRepository.findCovid19ByCountry(covid19.getCountry());
        if(country.isPresent())
        {
            throw new AlreadyExistException();
        }else
        {
            this.covidRepository.save(covid19);
        }

    }

    public void deleteCovidCountry(Long id) throws DoesNotExistException {
        boolean doesExist = this.covidRepository.existsById(id);
        if(doesExist)
        {
            this.covidRepository.deleteById(id);
        }else
        {
            throw new DoesNotExistException();
        }
    }

    @Transactional
    public void updateCountryNameAndRegion(long id,String name,String region) throws AlreadyExistException {
        if(name.length() > 0 && region.length() > 0)
        {
            Optional<Covid19> exist = this.covidRepository.findCovid19ByCountry(name);
            if(exist.isPresent())
            {
                throw  new AlreadyExistException();
            }else
            {
                Covid19 country = this.covidRepository.getById(id);
                country.setCountry(name);
                country.setWHORegion(region);
            }
        }

    }
}
