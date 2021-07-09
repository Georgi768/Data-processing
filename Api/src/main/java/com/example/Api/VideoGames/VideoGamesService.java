package com.example.Api.VideoGames;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class VideoGamesService {
    private final VideoGamesRepository videoGamesRepository;
    @Autowired
    public VideoGamesService(VideoGamesRepository videoGamesRepository) {
        this.videoGamesRepository = videoGamesRepository;
    }

    public List<Videogames> getAllVideoGames() {
        return this.videoGamesRepository.findAll();
    }

    public Optional<Videogames> getGameById(long id) throws DoesNotExistException {
        boolean ifExist = this.videoGamesRepository.existsById(id);
        if(ifExist)
        {
            return this.videoGamesRepository.findById(id);
        }
        throw new DoesNotExistException();
    }

    public void createGame(Videogames videogames) throws AlreadyExistException {
        Optional<Videogames> exist = this.videoGamesRepository.findVideogamesByName(videogames.getName());
        if(exist.isPresent())
        {
            throw new AlreadyExistException();
        }else
        {
            this.videoGamesRepository.save(videogames);
        }
    }

    public void deleteGameById(long id) throws DoesNotExistException {
        boolean gameExist = this.videoGamesRepository.existsById(id);
        if(gameExist)
        {
            Videogames game = this.videoGamesRepository.getById(id);
            this.videoGamesRepository.delete(game);
        }else
        {
            throw new DoesNotExistException();
        }
    }
    @Transactional
    public void updateVideoGameContent(long id, String country, String name) throws DoesNotExistException {
        if(country.length() > 0 && Character.isUpperCase(country.charAt(0)) && name.length() > 0)
        {
            boolean isExist = this.videoGamesRepository.existsById(id);
            if(isExist)
            {
                Videogames game = this.videoGamesRepository.getById(id);
                game.setCountrywhereproduced(country);
                game.setName(name);
            }else
            {
                throw new DoesNotExistException();
            }
        }else
        {
            throw new RuntimeException("Invalid input");
        }

    }

    public List<Videogames> getCountryByName(String countryName) {
       return this.videoGamesRepository.findAllVideoGamesBycountrywhereproduced(countryName);
    }
}
