package com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo")
public class CRUDApplication {

	public static void main(String[] args) {
		SpringApplication.run(CRUDApplication.class, args);
	}

}