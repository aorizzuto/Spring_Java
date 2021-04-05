package com.springframwork.dependencyinjection.controllers;

import com.springframwork.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

// Injection dependencies without Spring
//public class PropertyInjectedController {
//
//    public GreetingService greetingService;
//
//    public String getGreeting() {
//        return greetingService.sayGreeting();
//    }
//}

// With Spring
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}