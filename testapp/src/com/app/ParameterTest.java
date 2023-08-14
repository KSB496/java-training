package com.app;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterTest {

	public static int [][] data(){
		return new int[][] {{1,2,2},{5,3,15},{121,4,484}};
	}
	@ParameterizedTest
	@MethodSource(value = "data")
	void testParameter(int[] data1) {
		Calculator cal = new Calculator();
		int m1 = data1[0];
		int m2 = data1[1];
		int expected = data1[2];
		assertEquals(expected, cal.multiValues(m1, m2));
	}
}
