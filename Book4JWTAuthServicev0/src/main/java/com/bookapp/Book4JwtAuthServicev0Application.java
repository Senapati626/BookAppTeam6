package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Book4JwtAuthServicev0Application {

	public static void main(String[] args) {
		SpringApplication.run(Book4JwtAuthServicev0Application.class, args);
	}

}
