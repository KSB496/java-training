package com.seedBank.debug;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("Lourie");
		set.add("Amy");
		set.add("Richard");
		set.add("Mark");
		Debug debug = new Debug();
		System.out.println("Printing Records : ");
		debug.showRecords(set);
	}
	
	public void showRecords(Set<String> set){
		if(!set.isEmpty()) {
			Iterator<String> iterator=set.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		else {
			System.out.println("Set ia an empty set");
		}
	}

}
