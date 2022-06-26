package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class Book7ExternalApiServicev0Application {

	public static void main(String[] args) {
		SpringApplication.run(Book7ExternalApiServicev0Application.class, args);
	}

}
