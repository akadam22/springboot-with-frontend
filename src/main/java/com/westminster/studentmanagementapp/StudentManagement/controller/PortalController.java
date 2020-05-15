package com.westminster.studentmanagementapp.StudentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalController {

    @GetMapping("/index")  //this annotation gets  any request to /index url and excutes this method
    public String initialPage(){
        return "index";
    }
}

