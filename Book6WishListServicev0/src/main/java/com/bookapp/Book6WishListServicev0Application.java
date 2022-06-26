package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Book6WishListServicev0Application {

	public static void main(String[] args) {
		SpringApplication.run(Book6WishListServicev0Application.class, args);
	}

}
