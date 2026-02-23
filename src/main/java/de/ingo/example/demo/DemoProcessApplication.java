package de.ingo.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.client.annotation.Deployment;

@SpringBootApplication
@Deployment(resources = { "*.bpmn", "*.form" })
public class DemoProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProcessApplication.class, args);
	}
}