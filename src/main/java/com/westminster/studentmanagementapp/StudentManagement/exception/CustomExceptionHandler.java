package com.westminster.studentmanagementapp.StudentManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;


@ControllerAdvice
public class CustomExceptionHandler {

 //This method is called when student id entered is not valid or does not exist.
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleStudentNotFoundException(StudentNotFoundException exception, WebRequest request){
       ErrorDetails errorDetails = new ErrorDetails();
       errorDetails.setTime(LocalDateTime.now());
       errorDetails.setMessage(exception.getMessage());
       errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
       return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    //This method is called when module id is not valid.
    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleCourseNotFoundException(CourseNotFoundException exception, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTime(LocalDateTime.now());
        errorDetails.setMessage(exception.getMessage());
        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    //This method is called when course id is not valid.
    @ExceptionHandler(ModuleNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleModuleNotFoundException(ModuleNotFoundException exception, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTime(LocalDateTime.now());
        errorDetails.setMessage(exception.getMessage());
        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    //This method is called when something went wrong from the server side.
    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<ErrorDetails> handleGenericException(GlobalException exception, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTime(LocalDateTime.now());
        errorDetails.setMessage(exception.getMessage());
        errorDetails.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
