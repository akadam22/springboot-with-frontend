package com.westminster.studentmanagementapp.StudentManagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  annotates the class to be REST controller which gives access to mapping of the rest methods
public class HomeController {

    @RequestMapping("/home") //this annotation gets  any request to /welcome url and excutes this method
    public String homePage(){
        return "Welcome";
    }

}