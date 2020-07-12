package com.westminster.studentmanagementapp.StudentManagement.controller;

import com.westminster.studentmanagementapp.StudentManagement.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CourseController {


    @Autowired //inject object implicitly
    private CourseService service;


/*
    The following code is for crud operations using postman
 */

    @RequestMapping("/getAllCourses")
    public List<Course> getCourses(){
        return service.getCourses();
    }

    @RequestMapping("/getCourseById/{id}")
    public Course getCourse(@PathVariable String id){
        return service.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/addCourse")
    public void addCourses(@RequestBody Course course){
        service.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/updateCourseById/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        service.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/deleteCourseById/{id}")
    public void deleteCourse(@PathVariable String id){
        service.deleteCourse(id);
    }

}

