package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		HelloController controller = new HelloController();
		String result = controller.hello();
		System.out.println("result: " + result);
		SpringApplication.run(DemoApplication.class, args);
	}

}