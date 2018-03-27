package com.visitmed.controllers;

import com.visitmed.exceptions.ResourceAlreadyExistsException;
import com.visitmed.exceptions.ResourceNotFoundException;
import com.visitmed.exceptions.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HandlerController {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleResourceNotFound(final ResourceNotFoundException ex) {

    }

    @ExceptionHandler(ResourceAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public void handleResourceAlreadyExists(final ResourceAlreadyExistsException ex) {

    }

    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleValidationException(final ValidationException ex) {

    }

}
