package com.example.udemycourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.*")
@EntityScan("com.example.*")
@EnableJpaRepositories("com.example.udemycourse.repository")
public class UdemycourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemycourseApplication.class, args);
	}

}
