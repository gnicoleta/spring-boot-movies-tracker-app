package com.movies.tracker.controller;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.service.movie_service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
/*
    //so id is the token that will get its value from the url
    @RequestMapping("/movies/{title}")
    //that PathVariable annotation get the value from the id token (and its value given in the url)
    //and passes it to the id parameter from my method
    //(not recommended)you can have other name for the token, but you'll have to specify it to the param from the method
    public Movie getMovieByTitle(@PathVariable String title) {
        return movieService.getMovieByTitle(title);
    }

*/
    @RequestMapping("/users/{username}")
    public List<Movie> getMoviesByAssignedToUser(@PathVariable String username) {
        return movieService.getMoviesAssignedToUser(username);
    }

}
