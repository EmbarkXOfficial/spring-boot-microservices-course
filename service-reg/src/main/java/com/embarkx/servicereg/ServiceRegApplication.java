package com.embarkx.servicereg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegApplication.class, args);
	}

}
