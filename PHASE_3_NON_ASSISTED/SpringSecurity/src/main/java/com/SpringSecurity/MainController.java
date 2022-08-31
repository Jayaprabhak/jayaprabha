package com.SpringSecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/user")
    public String protectedHello(){
        return "Hello World, I was Protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello World from Admin !!";
    }

}