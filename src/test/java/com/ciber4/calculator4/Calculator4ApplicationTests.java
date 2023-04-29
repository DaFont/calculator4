package com.ciber4.calculator4;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class Calculator4ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.sum(2, 3));
	}
}