package me.droized.atlastest.impl;

import lombok.AllArgsConstructor;
import me.droized.atlastest.models.Users;
import me.droized.atlastest.repositories.UsersRepository;
import me.droized.atlastest.services.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public ResponseEntity<?> createUser(Users u) {

        return ResponseEntity.ok(this.usersRepository.save(u));
    }

    @Override
    public ResponseEntity<?> getAllUsers() {

        return ResponseEntity.ok(this.usersRepository.findAll());
    }
}
