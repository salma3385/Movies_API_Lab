package com.example.Movies.Controllers;

import com.example.Movies.Services.MovieService;
import com.example.Movies.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PatchMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }
    @PatchMapping("/addMovie")
 public List<Movie> addMovies(@RequestBody List<Movie> movies){
        return movieService.saveMovie(movies);
 }
 @GetMapping("/movies")
 public List<Movie> findAllMovies(){
        return movieService.getMovies();
 }
    @GetMapping("/movie/{id}")
 public Movie findMovieById(@PathVariable  int id){
        return movieService.getMovieById(id);
 }


}
