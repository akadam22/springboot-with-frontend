package com.westminster.studentmanagementapp.StudentManagement.repository;

import com.westminster.studentmanagementapp.StudentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository extends JpaRepository<Student,String> {
}
