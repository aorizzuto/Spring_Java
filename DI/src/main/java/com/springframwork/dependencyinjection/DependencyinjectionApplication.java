package com.springframwork.dependencyinjection;

import com.springframwork.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyinjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.getGreeting());

		System.out.println("-------------- Property with Spring");
		PropertyInjectedController controller = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(controller.getGreeting());

		System.out.println("-------------- Setter with Spring");
		SetterInjectedController controller2 = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(controller2.getGreeting());

		System.out.println("-------------- Constructor with Spring");
		ContructorInjectedController controller3 = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(controller3.getGreeting());

		System.out.println("-------------- Profiles");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}

}
