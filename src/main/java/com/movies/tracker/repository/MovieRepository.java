package com.movies.tracker.repository;

import com.movies.tracker.bean.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
