package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class UserDeletedException extends BaseException {
    public UserDeletedException(String message) {
        super(message);
    }
    public UserDeletedException() {}
}
