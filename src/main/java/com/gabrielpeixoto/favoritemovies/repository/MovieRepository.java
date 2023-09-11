package com.gabrielpeixoto.favoritemovies.repository;

import com.gabrielpeixoto.favoritemovies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    public Movie findByMovieId(String id);
}
