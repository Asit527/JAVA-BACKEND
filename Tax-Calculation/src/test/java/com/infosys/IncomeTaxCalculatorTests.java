package com.infosys;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IncomeTaxCalculatorTests {
	static IncomeTaxCalculator ic;
	@BeforeAll
	public  static void afterAll() {
		ic =new IncomeTaxCalculator();

	}

	@Test
	public void testCalculateBelow4l() {
		int expectedTax=0;

		int result= ic.calculate(300);
		assertEquals(expectedTax, result);
	}
	@Test
	public void testCalculateBelow8l() {
		int expectedTax=30000;

		int result= ic.calculate(600000);
		assertEquals(expectedTax, result);
	}
	@Test
	public void testCalculateBelow12l() {
		int expectedTax=100000;

		int result= ic.calculate(1000000);
		assertEquals(expectedTax, result);

	}
	@Test
	public void testCalculateBelow16l() {
		int expectedTax=225000;

		int result= ic.calculate(1500000);
		assertEquals(expectedTax, result);

	}
	@Test
	public void testCalculateBelow20l() {
		int expectedTax=360000;

		int result= ic.calculate(1800000);
		assertEquals(expectedTax, result);

	}
	@Test
	public void testCalculateBelow24l() {
		int expectedTax=550000;

		int result= ic.calculate(2200000);
		assertEquals(expectedTax, result);

	}
	@Test
	public void testCalculateAbove24l() {
		int expectedTax=1500000;

		int result= ic.calculate(5000000);
		assertEquals(expectedTax, result);

	}



}

