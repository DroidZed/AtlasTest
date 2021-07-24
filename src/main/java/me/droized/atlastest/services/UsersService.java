package me.droized.atlastest.services;

import me.droized.atlastest.messages.ResponseMessage;
import me.droized.atlastest.models.UserDataDTO;
import me.droized.atlastest.models.Users;

import java.util.List;

/**
 * Service Layer for the User management.
 * <p>
 * Containing all CRUD methods acting on the data queried.
 */
public interface UsersService {

    /**
     * Basic method for creating users in our application.
     *
     * @param u The user that we wish to add to our database.
     * @return the user created.
     */
    Users createUser(UserDataDTO u);

    /**
     * Simple method for fetching users from the database.
     *
     * @return the users fetched.
     */
    List<Users> getAllUsers();

    /**
     * A method for getting a user.
     *
     * @param id The id of the user user that we want to get.
     * @return the user requested.
     */
    Users getOneUser(String id);

    /**
     * Basic method for creating users in our application.
     *
     * @param u  The new data to use in our update query.
     * @param id The id of the user that we wish to update in our database.
     * @return the user updated.
     */
    Users updateInfo(UserDataDTO u, String id);

    /**
     * Basic method for deleting users in our application.
     *
     * @return message about the deletion
     */
    ResponseMessage deleteAll();

    /**
     * Basic method for creating users in our application.
     *
     * @param id The id of the user that we wish to delete from our database.
     * @return message about the deletion
     */
    ResponseMessage deleteOne(String id);

}
