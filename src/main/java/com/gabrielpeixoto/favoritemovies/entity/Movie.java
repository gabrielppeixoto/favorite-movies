package com.gabrielpeixoto.favoritemovies.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "movies")
@Getter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String movieId;

    @Column(name = "movie_name", nullable = false)
    private String name;

    @Column(name = "movie_description")
    private String description;
}
