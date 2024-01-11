package com.example.demo33333;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo33333Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("12369877dfsdfdf");
		SpringApplication.run(Demo33333Application.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("15963258963231");
        return application.sources(Demo33333Application.class);
    }

}
