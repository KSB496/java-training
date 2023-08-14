package com.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

import collectiondemo.UserNameOrder;

public class UserApp {

	ArrayList<Users> a1 = new ArrayList<Users>();
	
	public static void main(String[] args) {
		
		new UserApp().start();

	}
	public void start() {
		getUser();
		
		Collections.sort(a1,new UserNameOrder());
		
		//System.out.println(a1);
		
		for(Users u : a1) {
			System.out.println(u);
		}
		
	}
	
	public void getUser() {
		try {
			File file = new File("empdata.txt");
			if(file.length()==0) {
				throw new Exception("File is Empty");
			}
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			
			while((line = br.readLine())!=null) {
				addUser(line);	
				}		
								
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addUser(String parse) {
		String [] token = parse.split("/");
		Users users = new Users(Integer.parseInt(token[0]),token[1],token[2],token[3],token[4]);
		a1.add(users);
	}

}
