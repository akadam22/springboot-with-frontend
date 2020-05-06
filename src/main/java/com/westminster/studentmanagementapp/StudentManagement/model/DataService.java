package com.westminster.studentmanagementapp.StudentManagement.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface DataService extends CrudRepository<Student,String> {
}
