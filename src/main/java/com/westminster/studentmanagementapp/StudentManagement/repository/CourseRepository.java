package com.westminster.studentmanagementapp.StudentManagement.repository;

import com.westminster.studentmanagementapp.StudentManagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface CourseRepository extends JpaRepository<Course,String> {
}
