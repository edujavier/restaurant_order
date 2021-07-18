package com.canterita.challenge.backend.test.exception;

public class OrderNotFoundException extends Exception {

    public OrderNotFoundException(String errorMessage){
        super(errorMessage);

    }

}
