package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        // master branch
        System.out.println("This is a master branch.");

        // second branch
        System.out.println("This is a second branch.");

        SpringApplication.run(DemoApplication.class, args);
    }


}
