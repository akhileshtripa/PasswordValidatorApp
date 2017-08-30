package com.myorg.client;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myorg.client.Client;
import com.myorg.config.AppConfig;
import com.myorg.service.PasswordService;

public class Client {

    private PasswordService passwordService;
 
    @Autowired
    public void setPasswordService(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Client client = ctx.getBean(Client.class);
        Set<String> errors = client.validatePassword(args[0]);
        for (String error : errors) {
            System.out.println(error);
        }
    }

    public Set<String> validatePassword(String password) {
        return passwordService.validate(password);
    }

}
