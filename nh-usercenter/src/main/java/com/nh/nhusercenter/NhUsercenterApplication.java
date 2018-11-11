package com.nh.nhusercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

@EnableDiscoveryClient
public class NhUsercenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(NhUsercenterApplication.class, args);
	}
}
