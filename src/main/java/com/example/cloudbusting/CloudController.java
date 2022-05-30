package com.example.cloudbusting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {


    //create a get request method that returns a string
    @GetMapping("/message")
    public String getMessage(){
        return "hello and welcome to cloud what is up";
    }

}
