package me.droized.atlastest.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.droized.atlastest.models.Users;
import me.droized.atlastest.services.UsersService;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
public class UsersQueryResolver implements GraphQLQueryResolver {

    private final UsersService usersService;

    public List<Users> allUsers() {
        log.info("Retrieving all users...");
        return this.usersService.getAllUsers();
    }

    public Users getUserById(String _id) {
        log.info("Retrieving the user with id {}...", _id);
        return this.usersService.getOneUser(_id);
    }
}
