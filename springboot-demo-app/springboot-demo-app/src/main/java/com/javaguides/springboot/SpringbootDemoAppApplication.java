package com.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"com.demo"})
@SpringBootApplication

//@SpringBootApplication(scanBasePackages = {"com.demo"})
public class SpringbootDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoAppApplication.class, args);
	}

}
