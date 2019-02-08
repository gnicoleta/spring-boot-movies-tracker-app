package com.movies.tracker.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private int status;

   // @OneToMany(mappedBy = "assignedToUser")
    //private List<Movie> moviesList;

    @ManyToMany
    @JoinTable(name="users_movies",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns =  @JoinColumn(name="movie_id")
    )
    private List<Movie> movies = new ArrayList<>();


    public User() {
    }

    public User(String username) {
        this.username = username;
    }
    public User(String username, int status) {
        this.username = username;
        this.status =status;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
