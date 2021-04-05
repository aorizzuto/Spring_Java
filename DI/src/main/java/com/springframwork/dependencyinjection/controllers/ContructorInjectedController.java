package com.springframwork.dependencyinjection.controllers;

import com.springframwork.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Injection dependencies without Spring
//public class ContructorInjectedController {
//
//    private GreetingService greetingService;
//
//    public ContructorInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    public String getGreeting() {
//        return greetingService.sayGreeting();
//    }
//
//}

// With Spring
@Controller
public class ContructorInjectedController {

    private GreetingService greetingService;

    public ContructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}