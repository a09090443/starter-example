package com.example.controller;

import com.example.model.User;
import com.example.service.ExampleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
public class RestExampleController {
    private final ExampleService exampleService;

    RestExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return exampleService.findUsers();
    }

    @GetMapping("/getDataUsers")
    public String getDataUsers() {
        exampleService.findExample1Data();
        return HttpStatus.OK.getReasonPhrase();
    }

    @GetMapping("/getDataInfos")
    public String getDataInfos() {
        exampleService.findExample2Data();
        return HttpStatus.OK.getReasonPhrase();
    }
}
