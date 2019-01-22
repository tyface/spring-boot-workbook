package com.apress.spring;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

public class SpringBootConfigApplicationTests {

	@Rule
	public OutputCapture capture = new OutputCapture();
	
	@Test
	public void stringTest() {
		System.out.println("test!!");
		assertThat(capture.toString(), containsString("test!"));
		
	}

}

