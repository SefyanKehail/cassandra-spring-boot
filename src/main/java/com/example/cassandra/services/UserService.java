package com.example.cassandra.services;

import com.example.cassandra.entities.User;
import com.example.cassandra.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public User create(String name, int age, String email){
        User user = new User();

        user.setId(UUID.randomUUID());
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        userRepository.save(user);
        return user;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
