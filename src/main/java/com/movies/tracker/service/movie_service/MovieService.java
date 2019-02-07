package com.movies.tracker.service.movie_service;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {

        List<Movie> movies = (List<Movie>) movieRepository.findAll();
        return movies;
    }
    @Override
    public Movie getMovieByTitle(String title) {

        Movie movie = (Movie) movieRepository.findByTitle(title);
        return movie;
    }

    @Override
    public List<Movie> getMoviesAssignedToUser(String username) {
        List<Movie> movies = (List<Movie>) movieRepository.findByAssignedToUser(username);
        return movies;
    }
}
