package com.training.org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void addTest() {
		Calculation cal = new Calculation();
		assertEquals(30, cal.add(10,20));
	}
	
	@Test
	public void subTest() {
		Calculation cal = new Calculation();
		assertEquals(-10, cal.sub(10,20));
	}
}
