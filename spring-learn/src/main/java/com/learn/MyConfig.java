package com.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learn")
public class MyConfig {
	
	@Bean
	public String hello() {
		return "Hello Spring.";
	}
	
}