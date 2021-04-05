package com.springframwork.dependencyinjection.controllers;

import com.springframwork.dependencyinjection.services.GreetingService;
import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Injection dependencies without Spring
//public class SetterInjectedController {
//
//    private GreetingService greetingService;
//
//    public void setGreetingService(GreetingService greetingService) {
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
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
