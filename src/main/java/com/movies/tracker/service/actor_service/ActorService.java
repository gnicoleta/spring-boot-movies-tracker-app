package com.movies.tracker.service.actor_service;

import com.movies.tracker.bean.Actor;
import com.movies.tracker.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActorService implements IActorService{
    @Autowired
    ActorRepository actorRepository;


    @Override
    public List<Actor> getAllActors() {
        List<Actor> actors = (List<Actor>) actorRepository.findAll();
        return actors;
    }

    @Override
    public List<Actor> getMoviesActors(String title) {
        List<Actor> actors = (List<Actor>) actorRepository.findActorsByMovie(title);
        return actors;
    }
}
