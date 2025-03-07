package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GlobalExceptionHandler {



    @PostMapping
    public ResponseEntity<String> addEmployee
            (@Valid @RequestBody Employee employee, BindingResult result)
    {
        if (result.hasErrors())
        {
            return ResponseEntity.badRequest().body("Validation failed");
        }
        return ResponseEntity.ok("Employee added successfully!");
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationExceptions (MethodArgumentNotValidException ex)
    {
        return new ResponseEntity<>(ex.getBindingResult().getAllErrors(),
                HttpStatus.BAD_REQUEST);
    }




}
