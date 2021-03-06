package com.westminster.studentmanagementapp.StudentManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException{


//This is used during the deserialization of an object, to ensure that a loaded class is compatible with the
// serialized object. If no matching class is found, an InvalidClassException is thrown.
    private static final long serialVersionUID = -470180507998010368L;
    public StudentNotFoundException() {
    }

    public StudentNotFoundException(String id) {
        super("Student not found with : " + id + " Try with valid ID.");
    }


}
