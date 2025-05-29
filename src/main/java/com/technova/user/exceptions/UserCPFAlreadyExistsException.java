package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class UserCPFAlreadyExistsException extends BaseException {
    public UserCPFAlreadyExistsException(String message) {
        super(message);
    }
    public UserCPFAlreadyExistsException() {}
}
