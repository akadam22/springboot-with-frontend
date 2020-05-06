package com.westminster.studentmanagementapp.StudentManagement.controller;

import com.westminster.studentmanagementapp.StudentManagement.model.Student;
import com.westminster.studentmanagementapp.StudentManagement.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  //create a restful web service
public class StudentController {
    @Autowired //inject object implicitly
    private StudentService service;

    @GetMapping("/getStudent")
    public ResponseEntity<Student> getStudent(@RequestBody Student student){
        service.getStudents();
        return new ResponseEntity<Student>(student,HttpStatus.OK);
    }

    //   @RequestMapping("/student/{id}")
//    public Student getSubject(@PathVariable String id){
//        return service.getSubject(id);
//    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        service.addStudent(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }
//
//    @RequestMapping(method = RequestMethod.PUT, value="/subject/{id}")
//    public void updateStudent(@RequestBody Student student, @PathVariable String id){
//        service.updateSubject(id, student);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value="/subject/{id}")
//    public void deleteStudent(@PathVariable String id){
//         service.deleteStudent(id);
//    }



}
