package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class UserUsernameAlreadyExists extends BaseException {
    public UserUsernameAlreadyExists(String message) {
        super(message);
    }
    public UserUsernameAlreadyExists() {}
}
