package com.example.springing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
public class SpringingApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(SpringingApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);

	//	SpringApplication.run(SpringingApplication.class, args);
	}

}
