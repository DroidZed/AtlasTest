package me.droized.atlastest.exceptions.UserNotFound;

import static java.text.MessageFormat.format;


public class UserNotFoundException extends RuntimeException {
    /**
     * Exception thrown when there is no user in the database to be fetched.<br>
     * <p>
     * The constructor takes the id of the user that triggered the exception.
     *
     * @param id the id of the user
     */
    public UserNotFoundException(String id) {
        super(format("User with id {0}could not be found !", id));
    }
}
