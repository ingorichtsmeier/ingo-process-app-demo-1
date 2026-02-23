package de.ingo.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.client.annotation.Deployment;

@SpringBootApplication
@Deployment(resources = { "classpath:*.bpmn", "classpath:*.form" })
public class DemoProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProcessApplication.class, args);
	}
}