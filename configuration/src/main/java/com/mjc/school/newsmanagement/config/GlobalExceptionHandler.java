package com.mjc.school.newsmanagement.config;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ConversionFailedException.class)
    public Object on(ConversionFailedException exception) {
        return null;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object on(MethodArgumentNotValidException exception) {
        return null;
    }

}
