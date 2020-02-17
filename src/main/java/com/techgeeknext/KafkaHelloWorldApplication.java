package com.techgeeknext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { KafkaHelloWorldApplication.class }, args);
	}
}