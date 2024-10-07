package org.example.jpa.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Application resource not found.");
    }

    public ResourceNotFoundException(String message) { super(message); }
}