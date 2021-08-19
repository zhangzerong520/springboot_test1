package com.example.demo001.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class dd {

    @RequestMapping("/hello")
    public String ho(){
        return "Hello springboot";
    }

    @RequestMapping("/")
    public String index(){
        return "/index.html";
    }
}
