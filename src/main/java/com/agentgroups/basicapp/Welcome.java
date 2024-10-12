package com.agentgroups.basicapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to agentesports.in";
    }

    @RequestMapping("/about")
    public String about(){
        return "About Page under Construction..........";
    }
}
