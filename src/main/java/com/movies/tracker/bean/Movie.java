package com.movies.tracker.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "movies")
public class Movie {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private String genre;
    private String description;

    /*
    @ManyToOne(cascade = {CascadeType.ALL})
    //@JoinColumn(name="assigned_to")
    private User assignedToUser;
*/

    @ManyToMany(mappedBy = "movies")
    private List<User> users = new ArrayList<>();


    @ManyToMany
    @JoinTable(name="movies_actors",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns =  @JoinColumn(name="actor_id")
    )
    private List<Actor> actors = new ArrayList<>();



    public Movie() {

    }

    public Movie(String title, String genre, String description) {
        this.title = title;
        this.genre = genre;
        this.description = description;

        //this.assignedToUser = new User(username);
    }



    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public List<Actor> getActors() {
        return actors;
    }

}