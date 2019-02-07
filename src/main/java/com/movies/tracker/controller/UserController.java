package com.movies.tracker.controller;

import com.movies.tracker.bean.Movie;
import com.movies.tracker.bean.User;
import com.movies.tracker.service.user_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
