package com.epam.movieapp.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@Getter
@Setter
public class Movie {
    @Id
    private String id;
    private String title;
    private LocalDate releaseDate;
    private int runtime;
    private List<String> actors;
    private List<String> directors;


}


