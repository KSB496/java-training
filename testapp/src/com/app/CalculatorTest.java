package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	int a;
	
	@BeforeEach
	public void callBefore() {
		//a=20;
		System.out.println("called before");
		
		//System.out.println(a);
	}
	
	@AfterEach
	public void callAfter() {
		System.out.println("called After");
		//System.out.println(a);
	}
	
	@RepeatedTest(3)
	void testAddValues() {
		assertEquals(50,new Calculator().addValues(30,20));
	}
	/*@Test
	void testSubtractValues() {
		assertEquals(10,new Calculator().subtractValues(30,20));
	}
	@Test
	void testMultiplyValues() {
		assertEquals(600,new Calculator().multiplyValues(30,20));
	}*/
	
	/*@Test
	void testCounter() {
		++a;
		assertEquals(21,a);
	}

	@Test
	void testCounter2() {
		++a;
		assertEquals(21,a);
	}*/
	//@Test
	public void findMax() {
		int arr[] = {10,20,50};
		assertEquals(50,new Calculator().findMax(arr));
		assertEquals(50, Calculator.findMax(new int[] {10,20,50}));
		
	}
	
	//@Test
	public void reverseData() {
		assertEquals("olleH dlroW ", new Calculator().reverseData("Hello World"));
	}

	public void testCube() {
		assertEquals(9, Calculator.findCube(3));
	}
}
