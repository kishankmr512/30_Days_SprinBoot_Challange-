package com.example.TestingFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
		"com.example.TestController", "com.example.Configration"})
//@ComponentScan(basePackages = {"com.example.TestController"})
public class TestingFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingFileApplication.class, args);
	}

}
