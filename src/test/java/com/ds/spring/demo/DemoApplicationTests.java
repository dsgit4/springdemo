package com.ds.spring.demo;

import com.ds.spring.demo.service.Greeting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void greetingShown() {
		String bannerString= Greeting.justToTest("Caller");
		assertTrue(bannerString.equals("Hello from Google Cloud!"));
	}
}
