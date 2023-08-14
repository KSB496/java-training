package com.defaultapp;

@FunctionalInterface
public interface DefaultDemo {

	public void add();
	public default void show() {
		System.out.println("default method");
	}
	
}
