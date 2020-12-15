package com.favour.developer.framework;

import com.favour.developer.framework.aop.MailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class AppConfig {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AppConfig.class, args);
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MailService mailService = run.getBean(MailService.class);
        System.out.println(mailService.sendMail());
    }
}