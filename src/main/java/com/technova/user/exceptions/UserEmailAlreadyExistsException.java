package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class UserEmailAlreadyExistsException extends BaseException {
    public UserEmailAlreadyExistsException(String message) {
        super(message);
    }
    public UserEmailAlreadyExistsException() {}
}
