package com.movies.tracker.service.actor_service;

import com.movies.tracker.bean.Actor;

import java.util.List;

public interface IActorService {
    public List<Actor> getAllActors();

    public List<Actor> getMoviesActors(String title);
}
