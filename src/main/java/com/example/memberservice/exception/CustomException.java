package com.example.memberservice.exception;

public class CustomException extends Exception {

    private String errorMessage;

    public CustomException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

}