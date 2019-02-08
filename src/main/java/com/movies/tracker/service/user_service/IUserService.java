package com.movies.tracker.service.user_service;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;

import java.util.List;

public interface IUserService {

    public List<User> getAllUsers();

    public List<User> getActiveUsers();

    //public List<Movie> getUserMovies(String username);
}
