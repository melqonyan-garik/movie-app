package com.epam.movieapp.controller;

import com.epam.movieapp.model.Movie;
import com.epam.movieapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

// MovieController.java
@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable String id) {
        return movieService.getMovieById(id).orElse(null);
    }

    @PostMapping
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable String id) {
        movieService.deleteMovie(id);
    }

    @GetMapping("/title/{title}")
    public List<Movie> getMoviesByTitle(@PathVariable String title) {
        return movieService.getMoviesByTitle(title);
    }

    @GetMapping("/releaseDate/{releaseDate}")
    public List<Movie> getMoviesByReleaseDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate releaseDate) {
        return movieService.getMoviesByReleaseDate(releaseDate);
    }
}

