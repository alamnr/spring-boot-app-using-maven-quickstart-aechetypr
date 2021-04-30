package com.spring.kevin.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Import(Myconfiguration.class)
public class HelloController {
	
	@Value("${name}")
	String name;
	
	@Autowired
	String message;
	
	@RequestMapping("/")
	public String home() {
		//return name;
		return message;
	}

}
