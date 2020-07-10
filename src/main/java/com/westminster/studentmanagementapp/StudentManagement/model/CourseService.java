package com.westminster.studentmanagementapp.StudentManagement.model;

import com.westminster.studentmanagementapp.StudentManagement.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService<T>{
    @Autowired   // this will inject the instance of courseRepository
    private CourseRepository courseRepository;


    public List<Course> getCourses(){
        List<Course> course = new ArrayList<>();
        courseRepository.findAll()
                .forEach(course:: add);     //iterable
        return course;
    }

    public Course getCourse(String id){
        return courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void addCourses(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
        courseRepository.save(course);   //it checks if there is id already there if yes it updates if no its adds
    }


    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }


}

