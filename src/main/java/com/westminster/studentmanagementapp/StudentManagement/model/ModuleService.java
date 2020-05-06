package com.westminster.studentmanagementapp.StudentManagement.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleService {
    @Autowired   // this will inject the instance of dataservice
    private ModuleDataService moduleDataService;


    public List<Module> getAllModules(String studentId){
        List<Module> modules = new ArrayList<>();
        moduleDataService.findByStudentId(studentId)
                .forEach(modules :: add);     //iterable
        return modules;
    }

    public Module getModule(String id){
        // return subjects.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return moduleDataService.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addModule(Module module) {
        moduleDataService.save(module);
    }

    public void updateModule(Module module) {
        moduleDataService.save(module);   //it checks if there is id already there if yes it updates if no its adds
    }

    public void deleteModule(String id) {
        moduleDataService.deleteById(id);
    }

}