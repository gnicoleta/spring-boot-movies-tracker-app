package com.movies.tracker.bean;

import lombok.Data;

import javax.persistence.*;

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

    @ManyToOne(cascade = {CascadeType.ALL})
    //@JoinColumn(name="assigned_to")
    private User assignedToUser;

    public Movie() {

    }

    public Movie(String title, String genre, String description, String username) {
        this.title = title;
        this.genre = genre;
        this.description = description;

        this.assignedToUser = new User(username);
    }
}