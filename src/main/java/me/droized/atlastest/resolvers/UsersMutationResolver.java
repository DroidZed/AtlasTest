package me.droized.atlastest.resolvers;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.droized.atlastest.messages.ResponseMessage;
import me.droized.atlastest.models.UserDataDTO;
import me.droized.atlastest.models.Users;
import me.droized.atlastest.services.UsersService;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class UsersMutationResolver implements GraphQLMutationResolver {

    private final UsersService usersService;

    public Users updateUserById(String _id, UserDataDTO newInfo) {
        log.info("Updating the user with id {}...", _id);
        return this.usersService.updateInfo(newInfo, _id);
    }

    public ResponseMessage deleteUserById(String _id) {
        log.info("Deleting the user with id {}...", _id);
        return this.usersService.deleteOne(_id);
    }

    public ResponseMessage deleteAllUsers() {
        log.info("Deleting all users...");
        return this.usersService.deleteAll();
    }

    public Users createUser(UserDataDTO data) {
        log.info("Creating a new user with data {}\n...", data);
        return this.usersService.createUser(data);
    }
}
