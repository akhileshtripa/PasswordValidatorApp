package com.myorg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myorg.client.Client;
import com.myorg.service.PasswordService;

@Configuration
public class AppConfig {

	// IOC is here
    public @Bean
    PasswordService passwordService() {
        return new PasswordService();
    }

    public @Bean
    Client client() {
        return new Client();
    }

}