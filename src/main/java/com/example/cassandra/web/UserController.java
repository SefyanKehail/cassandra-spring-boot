package com.example.cassandra.web;

import com.example.cassandra.entities.User;
import com.example.cassandra.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/users")
    private List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping("/users")
    private User create(@RequestBody String name, @RequestBody int age, @RequestBody String email){
        return userService.create(name, age, email);
    }
}
