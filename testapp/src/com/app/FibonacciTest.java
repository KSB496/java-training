package com.app;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized.Parameters;

public class FibonacciTest {
	
	public static int [][] data(){
		return new int[][] {{1,1},{6,8},{8,21}};
	}

	@ParameterizedTest
	@MethodSource(value = "data")
	void testFibonacci(int[] data1) {
		Fibonacci fb = new Fibonacci();
		int m1 = data1[0];
		int expected = data1[1];
		assertEquals(expected, fb.compute(m1));
	}
	
	/*@Parameters
	public static Collections<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ 1, 1 }, { 6, 8 }, { 8, 21 }
			});
	}

	private int input;
	private int expected;
	
	public FibonacciTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}
	@ParameterizedTest
	@MethodSource(value = "data")
	public void testFibonacci(int[] data1) {
		assertEquals(expected, Fibonacci.compute(input));
	}*/
	
}
