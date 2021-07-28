package com.zekeriyafince.SpringHibernateTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringHibernateTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateTaskApplication.class, args);
    }

}
