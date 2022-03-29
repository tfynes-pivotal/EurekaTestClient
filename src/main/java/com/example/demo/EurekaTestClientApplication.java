package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaTestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTestClientApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		System.out.println("hello");
		return "hello\n";
	}
}
