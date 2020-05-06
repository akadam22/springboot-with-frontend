package com.westminster.studentmanagementapp.StudentManagement.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModuleDataService extends CrudRepository<Module,String> {
    public List<Module> findByStudentId(String studentId);
}
