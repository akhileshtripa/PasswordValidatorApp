package com.myorg.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application  {

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}*/

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	
}