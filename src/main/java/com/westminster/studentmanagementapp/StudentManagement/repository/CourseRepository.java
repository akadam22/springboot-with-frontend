package com.westminster.studentmanagementapp.StudentManagement.repository;

import com.westminster.studentmanagementapp.StudentManagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,String> {
}
