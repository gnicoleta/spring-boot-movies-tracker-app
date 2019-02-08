package com.movies.tracker.bean;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "actors")
public class Actor {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String first_name;
    private String last_name;
    private int age;



    @ManyToMany(mappedBy = "actors", cascade = CascadeType.ALL)
    private List<Movie> movies = new ArrayList<>();

    public Actor() {
    }

    public Actor(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
//
//
//    public void addMovie(Movie movie) {
//        this.movies.add(movie);
//    }
//
//    public List<Movie> getMovies() {
//        return movies;
//    }

}
