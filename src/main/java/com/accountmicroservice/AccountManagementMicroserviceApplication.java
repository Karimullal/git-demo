package com.accountmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountManagementMicroserviceApplication {
	
	public static void m1(){}

	public static void main(String[] args) {
		SpringApplication.run(AccountManagementMicroserviceApplication.class, args);
	}

}
