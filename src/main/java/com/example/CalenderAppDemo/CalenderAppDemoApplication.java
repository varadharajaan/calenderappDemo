package com.example.CalenderAppDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example"})
public class CalenderAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalenderAppDemoApplication.class, args);
	}

}
