package com.example.HighTechStores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = { ErrorMvcAutoConfiguration.class })
public class HighTechStoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighTechStoresApplication.class, args);
	}

}
