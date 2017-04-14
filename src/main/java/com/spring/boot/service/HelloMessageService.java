package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {
	//@Value(value = "${name:unknown}")
	@Value(value = "Hard code")
	private String message;

	
	public String getMessage() {
		return message;
	}

	public String getMessage(String message) {
		return "Hello " + message;
	}
	
	
}
