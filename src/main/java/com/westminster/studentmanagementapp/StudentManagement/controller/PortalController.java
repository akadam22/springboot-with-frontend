package com.westminster.studentmanagementapp.StudentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalController {

    @GetMapping("/index")
    public String initialPage(){
        return "index";
    }
}

