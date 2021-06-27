package com.example.Api.Exception;

public class DoesNotExistException extends Exception{
    public DoesNotExistException() {
        super("This case does not exist");
    }
}
