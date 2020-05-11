package com.pinoyjavatech.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class IntegrationJdbcApplication implements ApplicationRunner {
	
	@Autowired
	private PersonGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(IntegrationJdbcApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		gateway.save(new Person(3, "Mama", "pasig"));
	}
	
	

}
