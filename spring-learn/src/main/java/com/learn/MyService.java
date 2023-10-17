package com.learn;

import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	private static final String NAME = "Song";
	
	public void run() {
		System.out.println("MyService run");
	}
	
	public String getName() {
		return NAME;
	}
}