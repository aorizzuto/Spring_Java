package com.springframwork.dependencyinjection.controllers;

import com.springframwork.dependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Injection dependencies without Spring
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}