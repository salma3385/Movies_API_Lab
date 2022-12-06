package com.example.Movies.Services;

import com.example.Movies.models.Movie;
import com.example.Movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    @Autowired
    private MovieRepository repository;

    //post
    public Movie saveMovie(Movie movie) {
        return repository.save(movie);
    }

    public List<Movie> saveMovie(List<Movie> movies) {
        return repository.saveAll(movies);

    }

    //Get
    public List<Movie> getMovies() {
        return repository.findAll();
    }

    public Movie getMovieById(int id) {
        return repository.findById(id).orElse(null);
    }
}

