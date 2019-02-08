package com.movies.tracker.service.user_service;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;
import com.movies.tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers(){
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    @Override
    public List<User> getActiveUsers() {
        List<User> users = (List<User>) userRepository.findActiveUsers();
        return users;
    }
/*
    @Override
    public List<Movie> getUserMovies(String username) {
        List<Movie> movies = (List<Movie>) userRepository.findMoviesByUsers(username);
        return movies;
    }
*/
}
