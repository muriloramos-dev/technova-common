package com.technova.exceptions;

public class TokenExpiredException extends BaseException {
    public TokenExpiredException(String message) {
        super(message);
    }
    public TokenExpiredException(){}
}
