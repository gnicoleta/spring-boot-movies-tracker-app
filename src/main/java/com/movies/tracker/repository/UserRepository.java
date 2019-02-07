package com.movies.tracker.repository;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    //@Query("select t.moviesList from User t where t.name like %?1")
    List<Movie> getAllMoviesByUsername(String username);
}
