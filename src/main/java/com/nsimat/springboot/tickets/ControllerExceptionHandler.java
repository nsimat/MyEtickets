package com.nsimat.springboot.tickets;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ErrorResponse notFound(NoSuchElementException exception){
        return ErrorResponse.create(exception, HttpStatus.NOT_FOUND, exception.getMessage());
    }
}
