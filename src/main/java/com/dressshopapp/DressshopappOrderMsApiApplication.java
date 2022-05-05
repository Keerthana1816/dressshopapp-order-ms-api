package com.dressshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class DressshopappOrderMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DressshopappOrderMsApiApplication.class, args);
	}

}
