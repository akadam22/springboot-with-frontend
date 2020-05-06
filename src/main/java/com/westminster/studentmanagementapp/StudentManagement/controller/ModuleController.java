package com.westminster.studentmanagementapp.StudentManagement.controller;

import com.westminster.studentmanagementapp.StudentManagement.model.Module;
import com.westminster.studentmanagementapp.StudentManagement.model.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

/*
    This class contains all the CRUD Methods required
 */

public class ModuleController {
    @Autowired
    private ModuleService serviceModule;

    @RequestMapping("/student/{id}/modules")
    public List<Module> getModules(@PathVariable String id){
        return serviceModule.getAllModules(id);
    }

    @RequestMapping("/student/{studentId}/modules/{id}")
    public Module getModule(@PathVariable String id){
        return serviceModule.getModule(id);
    }
/*

    @RequestMapping(method = RequestMethod.POST, value="/student/{studentId}/modules")
       public void addModule(@RequestBody Module module, @PathVariable String studentId){  // we can get the subject id through path param
        module.setSub(new Student(studentId, "",""));
       serviceModule.addModule(module);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/student/{studentId}/modules/{id}")
    public void updateModule(@RequestBody Module module, @PathVariable String studentId, @PathVariable String id){
       module.setSub(new Student(studentId, "",""));
        serviceModule.updateModule(module);
    }
*/

    @RequestMapping(method = RequestMethod.DELETE, value="/student/{studentId}/modules/{id}")
    public void deleteModule(@PathVariable String id){
        serviceModule.deleteModule(id);
    }


}