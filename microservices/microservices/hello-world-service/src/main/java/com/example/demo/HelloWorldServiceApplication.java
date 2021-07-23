package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class HelloWorldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServiceApplication.class, args);
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello()
	{
		return ResponseEntity.ok("hello world spring");
	}

}
