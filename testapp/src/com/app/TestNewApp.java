package com.app;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestNewApp {

	@TestFactory
	Stream<DynamicTest> testDiifValue(){
		Calculator cal = new Calculator();
		int[][] data = new int[][] {{1,2,2},{5,3,15},{121,4,484}};
		return Arrays.stream(data).map(entry -> {
			int m1 = entry[0];
			int m2 = entry[1];
			int expected = entry[2];
			return dynamicTest(m1 + " * " + m2 + " = " + expected , ()-> {
				assertEquals(expected, cal.multiValues(m1, m2));
			});
		});
	}
	
}
