package com.example.Api.VideoGames;

import com.example.Api.Exception.AlreadyExistException;
import com.example.Api.Exception.DoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void createCountry(Videogames videogames) throws AlreadyExistException {
        Optional<Videogames> exist = this.videoGamesRepository.findVideogamesByName(videogames.getName());
        if(exist.isPresent())
        {
            throw new AlreadyExistException();
        }else
        {
            this.videoGamesRepository.save(videogames);
        }
    }
}