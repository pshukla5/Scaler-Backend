package com.dev.scalerbackend.ControllerAdvice;

import com.dev.scalerbackend.Dtos.ExceptionDto;
import com.dev.scalerbackend.Exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<ExceptionDto> handleNotFoundException(
            NotFoundException notFoundException
    ){
        return new ResponseEntity<>(new ExceptionDto(HttpStatus.NOT_FOUND,
                notFoundException.getMessage()), HttpStatus.NOT_FOUND);
    }




}
