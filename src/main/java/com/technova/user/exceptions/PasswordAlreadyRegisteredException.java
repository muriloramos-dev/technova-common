package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class PasswordAlreadyRegisteredException extends BaseException {
    public PasswordAlreadyRegisteredException(String message) {
        super(message);
    }
    public PasswordAlreadyRegisteredException(){}
}
