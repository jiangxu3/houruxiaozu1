package com.javakar.springbootbestpractices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBestPracticesApplication {

    /*

    INSERT INTO roles(NAME) VALUES('ROLE_USER');
    INSERT INTO roles(NAME) VALUES('ROLE_MODERATOR');
    INSERT INTO roles(NAME) VALUES('ROLE_ADMIN');
    INSERT INTO roles(NAME) VALUES('ROLE_STUDENT');

    */


    public static void main(String[] args) {
        SpringApplication.run(SpringBootBestPracticesApplication.class, args);
    }


}
