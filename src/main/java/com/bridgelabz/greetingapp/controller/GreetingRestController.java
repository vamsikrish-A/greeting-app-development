package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.entity.GreetingEntity;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingRestController {

    @Autowired
    private IGreetingService greetingService;
    @GetMapping("/")
    public String message() {
        return "Hello World";
    }
    @GetMapping("/get-message")
    public String greeting(@RequestParam(value = "firstName", defaultValue = "World") String firstName,
                           @RequestParam(value = "lastName", defaultValue = "World") String lastName) {
        return "hello"+firstName+" "+lastName;
    }
    @PostMapping("/add-greeting")
    public Greeting addGreeting(@RequestBody GreetingEntity greeting){
        return greetingService.addGreeting(greeting);
    }

    @GetMapping("/get-greeting")
    public Greeting getGreeting(@RequestBody Greeting greeting) {
        return greetingService.getGreetingById(greeting.getId());
    }



}
