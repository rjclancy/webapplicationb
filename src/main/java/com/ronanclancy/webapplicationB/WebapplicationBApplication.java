package com.ronanclancy.webapplicationB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class WebapplicationBApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebapplicationBApplication.class, args);
	}
}
