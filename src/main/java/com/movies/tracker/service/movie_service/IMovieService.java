package com.movies.tracker.service.movie_service;


import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;

import java.util.List;

public interface IMovieService {
    public List<Movie> getAllMovies();
    public Movie getMovieByTitle(String title);

    public List<Movie> getMoviesAssignedToUser(String username);
}
