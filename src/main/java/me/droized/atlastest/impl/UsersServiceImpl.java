package me.droized.atlastest.impl;

import lombok.AllArgsConstructor;
import me.droized.atlastest.exceptions.UserNotFound.UserNotFoundException;
import me.droized.atlastest.messages.ResponseMessage;
import me.droized.atlastest.models.UserDataDTO;
import me.droized.atlastest.models.Users;
import me.droized.atlastest.repositories.UsersRepository;
import me.droized.atlastest.services.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public Users createUser(UserDataDTO data) {

        return this.usersRepository.save(
                new Users(
                        data.getFullName(),
                        data.getAge(),
                        data.getOccupation(),
                        data.getGender()
                )
        );
    }

    @Override
    public List<Users> getAllUsers() {

        return this.usersRepository.findAll();
    }

    @Override
    public Users getOneUser(String id) {
        return this.usersRepository
                .findById(id)
                .orElseThrow(
                        () -> new UserNotFoundException(id)
                );
    }

    @Override
    public Users updateInfo(UserDataDTO u, String id) {
        return this.usersRepository
                .findById(id)
                .map(old -> {
                    old.setGender(u.getGender());
                    old.setOccupation(u.getOccupation());
                    old.setFullName(u.getFullName());
                    old.setAge(u.getAge());

                    return this.usersRepository.save(old);
                })
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public ResponseMessage deleteOne(String id) {
        this.usersRepository.deleteById(id);
        return new ResponseMessage("User with id " + id + " got deleted successfully !");
    }

    @Override
    public ResponseMessage deleteAll() {
        this.usersRepository.deleteAll();
        return new ResponseMessage("All users got deleted successfully !");

    }
}
