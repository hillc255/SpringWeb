package com.example;

import com.example.controller.UploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

//download: https://start.spring.io/
//run: mvn spring-boot:run
//in browser add: http://localhost:8080/index.html
//add componentscan because componet is in different package
//add @RestController html endpoint

@SpringBootApplication
@RestController
@ComponentScan(basePackageClasses= UploadController.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
