package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class UserDeactivateException extends BaseException {
    public UserDeactivateException(String message) {
        super(message);
    }
    public UserDeactivateException() {}
}
