package com.spring.kevin.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfiguration {

	@Bean
	public String message() {
		return "Hello O'Reilly";
	}
}
