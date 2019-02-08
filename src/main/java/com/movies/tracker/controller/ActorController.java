package com.movies.tracker.controller;

import com.movies.tracker.bean.Actor;
import com.movies.tracker.bean.Movie;
import com.movies.tracker.repository.ActorRepository;
import com.movies.tracker.service.actor_service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class ActorController {

    @Autowired
    private ActorService actorService;

    @RequestMapping("/actors")
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @RequestMapping("/movies/{title}")
    public List<Actor> getMoviesByAssignedToUser(@PathVariable String title) {
        return actorService.getMoviesActors(title);
    }
}
