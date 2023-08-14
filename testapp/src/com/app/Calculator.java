package com.app;

import java.util.StringTokenizer;

public class Calculator {

	public int addValues(int a, int b) {
		return a+b;
	}
	public int multiValues(int a, int b) {
		return a*b;
	}
	/*public int subtractValues(int a, int b) {
		return a-b;

	public int multiplyValues(int a, int b) {
		return a*b;
	}*/
	public static int findMax(int arr[]) {
		//int max=0;
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static String reverseData(String str) {
		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str," ");
		while(tokenizer.hasMoreTokens()) {
			StringBuilder builder = new StringBuilder();
			builder.append(tokenizer.nextToken());
			builder.reverse();
			result.append(builder);
			result.append(" ");
		}
		return result.toString();
	}
	public static int findCube(int num) {
		int cube = num * num * num;
		return cube;
		
	}
}
