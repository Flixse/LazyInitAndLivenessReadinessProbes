package com.example.lazyinit.resource;

import com.example.lazyinit.service.DeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @Autowired
    public DeadService deadService;

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello world!";
    }

    @GetMapping("/dead")
    public String getDeadState(){
        return deadService.getDeadState();
    }
}
