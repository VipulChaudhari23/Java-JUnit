package com.training.org;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCase {
	Calculation cal = new Calculation();

	@Test
	public void AddTest() {
//		Calculation cal = new Calculation();
		assertEquals(40, cal.add(30, 10));
//		fail("Not yet implemented");
	}

	@Test
	public void SubTest() {
//		Calculation cal = new Calculation();
		assertEquals(0, cal.sub(10, 10));
//		fail("Not yet implemented");
	}

	@Before
	public void Shoemsg() {
		System.out.println("Before is Called");
	}

}
