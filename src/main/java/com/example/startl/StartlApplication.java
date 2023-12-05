package com.example.startl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.ConfigurableWebApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
public class StartlApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartlApplication.class, args);


	}

}
