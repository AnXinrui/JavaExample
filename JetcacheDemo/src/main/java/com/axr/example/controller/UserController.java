package com.axr.example.controller;

import com.axr.example.domain.User;
import com.axr.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/user")
    public List<User> getUser(@RequestParam String name) {
        /*
        [{"name":null,"scores":null},{"name":"Tom","scores":[]}]
         */
        List<User> list = new ArrayList<User>();
        list.add(new User());
        User user = new User();
        user.setName("Tom");
        user.setScores(new ArrayList<Integer>());
        list.add(user);
        return list;
    }
}

