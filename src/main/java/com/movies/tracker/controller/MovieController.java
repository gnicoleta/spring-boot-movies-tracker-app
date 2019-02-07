package com.movies.tracker.controller;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {


    //this one is injected in the class where you need its services
    @Autowired
    private MovieService movieService;

    @RequestMapping("/movies")
    public List<Movie> getAllMovies() {
        //return topicService.getTopics();
        return movieService.getAllMovies();
    }
}
