package com.movies.tracker;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.repository.MovieRepository;
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
    CommandLineRunner runner(MovieRepository repository) {
        return args -> {
            repository.save(new Movie("Titanic", "romance", "nice"));
        };
    }
}

