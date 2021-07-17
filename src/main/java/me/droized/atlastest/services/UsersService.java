package me.droized.atlastest.services;

import me.droized.atlastest.models.Users;
import org.springframework.http.ResponseEntity;

public interface UsersService {

    ResponseEntity<?> createUser(Users u);

    ResponseEntity<?> getAllUsers();

}
