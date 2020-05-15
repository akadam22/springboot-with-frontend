package com.westminster.studentmanagementapp.StudentManagement.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService<T>{
    @Autowired   // this will inject the instance of dataservice
    private DataService dataService;


    public List<Student> getStudents(){
        List<Student> student = new ArrayList<>();
        dataService.findAll()
                .forEach(student:: add);     //iterable
        return student;
    }

    public Student getStudent(String id){
        return dataService.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addStudent(Student student) {
        dataService.save(student);
    }

    public void addStudents(Student student) {
        dataService.save(student);
    }

    public void updateStudent(String id, Student student) {
        dataService.save(student);   //it checks if there is id already there if yes it updates if no its adds
    }


    public void deleteStudent(String id) {

        dataService.deleteById(id);
    }

}
