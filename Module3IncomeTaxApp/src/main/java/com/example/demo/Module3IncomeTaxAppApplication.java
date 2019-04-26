package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.emp.controller")
@ComponentScan("com.emp.dao")
@ComponentScan("com.emp.service")
@ComponentScan("com.emp.model")
@ComponentScan("com.emp.userException")
@EntityScan(basePackages= {"com.emp"})
@SpringBootApplication
public class Module3IncomeTaxAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Module3IncomeTaxAppApplication.class, args);
	}

}
