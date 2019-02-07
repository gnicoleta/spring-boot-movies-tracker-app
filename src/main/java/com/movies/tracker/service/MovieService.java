package com.movies.tracker.service;

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
}
