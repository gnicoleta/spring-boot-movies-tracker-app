package com.movies.tracker.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

   // @OneToMany(mappedBy = "assignedToUser")
    //private List<Movie> moviesList;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }
}
