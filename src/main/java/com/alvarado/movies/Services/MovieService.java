package com.alvarado.movies.Services;

import com.alvarado.movies.Movie;
import com.alvarado.movies.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll() ; //This is described inside the Mongo repository class.
    }
}
