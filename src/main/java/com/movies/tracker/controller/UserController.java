package com.movies.tracker.controller;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;
import com.movies.tracker.service.user_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/users")
    public List<User> getAllUsers() {
        //return topicService.getTopics();
        return userService.getAllUsers();
    }

    @RequestMapping("/users/active")
    public List<User> getActiveUsers() {
        return userService.getActiveUsers();
    }

/*
    @RequestMapping("/users/{username}")
    public List<Movie> getMoviesByUser(@PathVariable String username) {
        return userService.getUserMovies(username);
    }
*/

   /* @RequestMapping(value = "/users/active", method = RequestMethod.GET)
    @ModelAttribute("active_users_list")
    public List<User> getActiveUsers(Model m) {
        //addAttribute("users_active", userService.getActiveUsers());
        //turn "active_users";
        return userService.getActiveUsers();
    }*/

}
