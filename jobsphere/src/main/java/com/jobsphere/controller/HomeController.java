// src/main/java/com/jobsphere/controller/HomeController.java

package com.jobsphere.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to JobSphere Backend!";
    }
}
