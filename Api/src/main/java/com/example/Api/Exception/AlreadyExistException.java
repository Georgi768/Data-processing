package com.example.Api.Exception;

public class AlreadyExistException extends Exception{
    public AlreadyExistException() {
        super("This case already exist!");
    }
}
