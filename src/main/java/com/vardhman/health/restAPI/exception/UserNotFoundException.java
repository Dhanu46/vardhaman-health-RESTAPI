package com.vardhman.health.restAPI.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Exception ex){super(message,ex);}
}
