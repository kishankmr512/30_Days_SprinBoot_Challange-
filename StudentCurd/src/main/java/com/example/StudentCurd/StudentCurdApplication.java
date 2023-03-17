package com.example.StudentCurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.StudentControler"})
public class StudentCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCurdApplication.class, args);
	}

}
