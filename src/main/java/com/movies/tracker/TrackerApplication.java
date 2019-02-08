package com.movies.tracker;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;
import com.movies.tracker.repository.MovieRepository;
import com.movies.tracker.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackerApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(MovieRepository repository, UserRepository userRepository) {
        return args -> {
            Movie m1 = new Movie("Titanic", "romance", "nice");
            Movie m2 = new Movie("Aquaman", "action", "nice");
            repository.save(m1);
            repository.save(m2);
            User u1 = new User("jon", 1);
            u1.addMovie(m1);
            User u2 = new User("ana", 1);
            u2.addMovie(m1);
            u2.addMovie(m2);
            userRepository.save(u1);
            userRepository.save(u2);

        };
    }
}

