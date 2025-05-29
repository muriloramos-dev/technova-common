package com.technova.user.exceptions;

import com.technova.exceptions.BaseException;

public class UserPhoneNumberAlreadyExistsException extends BaseException {
    public UserPhoneNumberAlreadyExistsException(String message) {
        super(message);
    }
    public UserPhoneNumberAlreadyExistsException() {}
}
