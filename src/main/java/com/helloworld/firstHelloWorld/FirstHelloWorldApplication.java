package com.helloworld.firstHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstHelloWorldApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "KORE WA!!!!!!") String name) {
		return String.format("NANDE %s!", name);
	}

}
