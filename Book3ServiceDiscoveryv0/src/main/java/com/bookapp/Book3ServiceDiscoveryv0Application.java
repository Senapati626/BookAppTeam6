package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Book3ServiceDiscoveryv0Application {

	public static void main(String[] args) {
		SpringApplication.run(Book3ServiceDiscoveryv0Application.class, args);
	}

}
