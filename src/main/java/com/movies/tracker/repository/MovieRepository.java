package com.movies.tracker.repository;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
    public Movie findByTitle(String title);

    //public List<Movie> findByAssignedToUser(String username);
/*
    @Query("select m.id, u.id, m.title, u.username, um.user_id, um.movie_id from Movie m join m.users um " +
            "on m.id = um.movie_id join User u on u.id = um.user_id " +
            "group by m.id, u.id, m.title, u.username, um.user_id, um.movie_id having u.username like %?1")*/
    @Query("select m.id, m.title, um.id, um.username from Movie m join m.users um " +
            "group by m.id, m.title, um.id, um.username having um.username like %?1")
    public List<Movie> findMoviesByUsers(String username);
}
