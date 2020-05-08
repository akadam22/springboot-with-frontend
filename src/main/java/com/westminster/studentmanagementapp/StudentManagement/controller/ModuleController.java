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

    @RequestMapping("/student/{mid}/modules")
    public List<Module> getModules(@PathVariable String mid){
        return serviceModule.getAllModules(mid);
    }

    @RequestMapping("/student/{studentId}/modules/{id}")
    public Module getModule(@PathVariable String mid){
        return serviceModule.getModule(mid);
    }


    @RequestMapping(method = RequestMethod.DELETE, value="/student/{studentId}/modules/{id}")
    public void deleteModule(@PathVariable String mid){
        serviceModule.deleteModule(mid);
    }


}