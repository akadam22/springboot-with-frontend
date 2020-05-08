package com.westminster.studentmanagementapp.StudentManagement.controller;

import com.westminster.studentmanagementapp.StudentManagement.model.Student;
import com.westminster.studentmanagementapp.StudentManagement.model.StudentDTO;
import com.westminster.studentmanagementapp.StudentManagement.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController  //create a restful web service
public class StudentController {
    @Autowired //inject object implicitly
    private StudentService service;

    @GetMapping("/getStudent")
    public ResponseEntity<StudentDTO> getStudent(){
        StudentDTO dto= new StudentDTO();
        dto.setStudentList(service.getStudents());

        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }


    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        service.addStudent(student);
        return new ResponseEntity<Student>(student, OK);
    }


}
