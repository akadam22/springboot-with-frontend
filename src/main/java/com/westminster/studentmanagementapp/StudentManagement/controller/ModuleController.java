package com.westminster.studentmanagementapp.StudentManagement.controller;

import com.westminster.studentmanagementapp.StudentManagement.model.Module;
import com.westminster.studentmanagementapp.StudentManagement.model.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //create a restful web service
public class ModuleController {

        @Autowired //inject object implicitly
        private ModuleService service;


/*
    The following code is for crud operations using postman
 */

        @RequestMapping("/getAllModules")
        public List<Module> getModules(){
            return service.getModules();
        }

        @RequestMapping("/getModuleById/{id}")
        public Module getModule(@PathVariable String id){
            return service.getModule(id);
        }

        @RequestMapping(method = RequestMethod.POST, value="/addModule")
        public void addModules(@RequestBody Module module){
            service.addModule(module);
        }

        @RequestMapping(method = RequestMethod.PUT, value="/updateModuleById/{id}")
        public void updateModule(@RequestBody Module module, @PathVariable String id){
            service.updateModule(id, module);
        }

        @RequestMapping(method = RequestMethod.DELETE, value="/deleteModuleById/{id}")
        public void deleteModule(@PathVariable String id){
            service.deleteModule(id);
        }

    }

