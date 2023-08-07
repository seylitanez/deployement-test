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
		System.out.println("salut tout le monde ceci est un test de depploiment api");
		return "<h1 style=\"background-color: red;\">salut tout le monde ceci est un test de depploiment api enfin docker itedu</h1>";
	}
}
