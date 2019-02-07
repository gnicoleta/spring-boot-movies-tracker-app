package com.movies.tracker.repository;

import com.movies.tracker.bean.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    public Movie findByTitle(String title);

    public List<Movie> findByAssignedToUser(String username);
}
