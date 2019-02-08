package com.movies.tracker.repository;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    //@Query("select t.moviesList from User t where t.name like %?1")
    List<Movie> getAllMoviesByUsername(String username);

    @Query("select u from User u where u.status = 1")
    List<User> findActiveUsers();
/*
    @Query("select m.id, u.id, m.title, u.username, um.user_id, um.movie_id from User u inner join users_movies um " +
            "on u.id = um.user_id inner join Movie m on m.id = um.movie_id " +
            "group by m.id, u.id, m.title, u.username, um.user_id, um.movie_id having u.username like %?1")
    public List<Movie> findMoviesByUsers(String username);
*/

    /*@Query("select m.id, u.id, m.title, u.username, um.movie_id, um.user_id from users u inner join users_movies um on u.id = um.user_id inner join movies m on m.id = um.movie_id group by  m.id, u.id, m.title, u.username, um.movie_id, um.user_id having u.username like %?1")
    public List<Movie> findMoviesByUsers(String username);*/

    //public List<Movie> findUsersByM

}
