package com.kodewala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoreCalculatorTests {
	// SIB Block
	static CoreCalculator cc;

	@BeforeAll
	public static void beforeAll() {
		cc = new CoreCalculator();
		System.out.println("CoreCalculatorTests.beforeAll()");
	}

	@Test
	public void testAddTwo() {
		int num1 = 1;
		int num2 = 2;
		int result = cc.addTwoNum(num1, num2);
		assertEquals(3, result);
		System.out.println("CoreCalculatorTests.testAddTwo()");
	}

	@Test
	public void testSubtractTwoNum() {
		int num1 = 1;
		int num2 = 2;
		int result = cc.subtractTwoNum(num1, num2);
		assertEquals(-1, result);
		System.out.println("CoreCalculatorTests.testSubtractTwoNum()");
	}

	@Test
	public void testMultiplyTwoNum() {
		int num1 = 1;
		int num2 = 2;
		int result = cc.multiplyTwoNum(num1, num2);
		assertEquals(2, result);
		System.out.println("CoreCalculatorTests.testMultiplyTwoNum()");
	}

	@Test
	public void testDevideTwoNum() {
		int num1 = 1;
		int num2 = 2;
		int result = cc.devideTwoNum(num1, num2);
		assertEquals(0, result);
		System.out.println("CoreCalculatorTests.testDevideTwoNum()");
	}

	@AfterAll
	 static  void sucess() {
		System.out.println("CoreCalculatorTests.sucess()");
	}

}
