package com.westminster.studentmanagementapp.StudentManagement.model;
import com.westminster.studentmanagementapp.StudentManagement.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleService<T>{
    @Autowired   // this will inject the instance of courseRepository
    private ModuleRepository moduleRepository;


    public List<Module> getModules(){
        List<Module> module = new ArrayList<>();
        moduleRepository.findAll()
                .forEach(module:: add);     //iterable
        return module;
    }

    public Module getModule(String id){
        return moduleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addModule(Module module) {
        moduleRepository.save(module);
    }

    public void addModules(Module module) {
        moduleRepository.save(module);
    }

    public void updateModule(String id, Module module) {
        moduleRepository.save(module);   //it checks if there is id already there if yes it updates if no its adds
    }


    public void deleteModule(String id) {
        moduleRepository.deleteById(id);
    }

}


