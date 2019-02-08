package com.movies.tracker.repository;

import com.movies.tracker.bean.Actor;
import com.movies.tracker.bean.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends CrudRepository<Actor, Long> {

    //public List<Actor> findAll();


    @Query("select um.id, a.id, a.first_name, a.last_name, um.title from Actor a join a.movies um " +
            "group by um.id, a.id, a.first_name, a.last_name, um.title having um.title like %?1")
    public List<Actor> findActorsByMovie(String title);
}
