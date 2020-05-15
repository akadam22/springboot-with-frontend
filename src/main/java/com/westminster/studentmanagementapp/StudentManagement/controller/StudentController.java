package com.westminster.studentmanagementapp.StudentManagement.controller;


import com.westminster.studentmanagementapp.StudentManagement.model.Student;
import com.westminster.studentmanagementapp.StudentManagement.model.StudentDTO;
import com.westminster.studentmanagementapp.StudentManagement.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.Subject;
import javax.validation.Valid;
import java.util.List;

@RestController  //create a restful web service
public class StudentController {
    @Autowired //inject object implicitly
    private StudentService service;

    /*
    The following is get and post method on html page
     */
   /* @GetMapping("/getStudent")
    public ResponseEntity<StudentDTO> getStudent(){
            StudentDTO dto= new StudentDTO();
                dto.setStudentList(service.getStudents());
        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){
        service.addStudent(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }*/

/*
    The following code is for crud operations using postman
 */

    @RequestMapping("/student")
    public List<Student> getSubjects(){
        return service.getStudents();
    }

    @RequestMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return service.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/student")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/student/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable String id){
        service.updateStudent(id, student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/student/{id}")
    public void deleteStudent(@PathVariable String id){
        service.deleteStudent(id);
    }

}
