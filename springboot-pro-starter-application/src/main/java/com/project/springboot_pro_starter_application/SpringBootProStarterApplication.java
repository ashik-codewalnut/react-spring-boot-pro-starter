package com.project.springboot_pro_starter_application;

import com.project.springboot_pro_starter_application.models.StarterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProStarterApplication implements CommandLineRunner {

	// Remove this section when you start working on top of this starter project
	@Autowired
	private StarterRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProStarterApplication.class, args);
	}

	// Remove this section when you start working on top of this starter project
	@Override
	public void run(String... args) throws Exception {
		repository.save(StarterModel.builder().message("Hello World!").build());
	}
}
