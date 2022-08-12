package com.example.atmserviceapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AtmServiceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmServiceApiGatewayApplication.class, args);
	}

}
