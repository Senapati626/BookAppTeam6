package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Book5OAuth2AuthServicev0Application {

	public static void main(String[] args) {
		SpringApplication.run(Book5OAuth2AuthServicev0Application.class, args);
	}

}
