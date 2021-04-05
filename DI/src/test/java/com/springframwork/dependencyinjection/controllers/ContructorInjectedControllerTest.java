package com.springframwork.dependencyinjection.controllers;

import com.springframwork.dependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Injection dependencies without Spring
class ContructorInjectedControllerTest {

    ContructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}