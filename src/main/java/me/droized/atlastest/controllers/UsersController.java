package me.droized.atlastest.controllers;

import lombok.AllArgsConstructor;
import me.droized.atlastest.models.Users;
import me.droized.atlastest.services.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @PostMapping(path = "add")
    public ResponseEntity<?> addUser(Users u) {
        return this.usersService.createUser(u);
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return this.usersService.getAllUsers();
    }
}
