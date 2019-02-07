package com.movies.tracker.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "movies")
public class Movie {


    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String genre;
    private String description;

    public Movie() {

    }

    public Movie(String title, String genre, String description) {
        this.title = title;
        this.genre = genre;
        this.description = description;
    }
}