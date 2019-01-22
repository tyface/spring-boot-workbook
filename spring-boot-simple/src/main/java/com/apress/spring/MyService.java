package com.apress.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Value("${data.server}")
	private String server;
	
	public String getServer() {
		return server;
	}
}
