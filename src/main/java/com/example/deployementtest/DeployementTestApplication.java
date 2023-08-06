package com.example.deployementtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployementTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployementTestApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "<h1>salut tout le monde ceci est un test de depploiment api</h1>";
	}
}
