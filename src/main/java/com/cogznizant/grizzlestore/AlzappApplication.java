package com.cogznizant.grizzlestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cognizant.grizzlestore.*")
public class AlzappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlzappApplication.class, args);
	}

}
