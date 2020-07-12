package com.westminster.studentmanagementapp.StudentManagement.repository;

import com.westminster.studentmanagementapp.StudentManagement.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface ModuleRepository extends JpaRepository<Module,String> {
}
