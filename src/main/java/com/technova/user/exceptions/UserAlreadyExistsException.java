package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class UserAlreadyExistsException extends BaseException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
