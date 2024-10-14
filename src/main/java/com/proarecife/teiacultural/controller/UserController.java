package com.proarecife.teiacultural.controller;

import com.proarecife.teiacultural.entity.User;
import com.proarecife.teiacultural.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = "application/json", consumes = "application/json")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Find all Users", tags = "User")
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @Operation(summary = "Find User by ID", tags = "User")
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable long id) {
        User user = userService.findById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @Operation(summary = "Update a User", tags = "User")
    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable long id) {
        User updatedUser = userService.update(id, user);
        return updatedUser != null ? ResponseEntity.ok(updatedUser) : ResponseEntity.notFound().build();
    }

    @Operation(summary = "Save a new User", tags = "User")
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        User savedUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @Operation(summary = "Delete a User by ID", tags = "User")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
            userService.delete(id);
    }
}