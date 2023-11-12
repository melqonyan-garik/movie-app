package com.epam.movieapp.repository;

import com.epam.movieapp.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {

    List<Movie> findByTitle(String title);

    List<Movie> findByReleaseDate(LocalDate releaseDate);
}
