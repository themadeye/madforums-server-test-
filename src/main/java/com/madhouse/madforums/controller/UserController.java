package com.madhouse.madforums.controller;

import javax.validation.Valid;
import com.madhouse.madforums.model.User;
import com.madhouse.madforums.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepo userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @PostMapping("/users")
    public User createEmployee(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

}
