package com.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CRUDMain {
	static List<Users> lst = new ArrayList<Users>();
	static Scanner s = new Scanner(System.in);
	static Scanner s1 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//List<Users> lst = new ArrayList<Users>();
		
		//Scanner s = new Scanner(System.in);
		//Scanner s1 = new Scanner(System.in);
		
		int ch;
		
		do {
			System.out.println("Type 1 to Insert User");
			System.out.println("Type 2 to Display User");
			System.out.println("Type 3 to Search User");
			System.out.println("Type 4 to Delete User");
			System.out.println("Type 5 to Update User");
			
			ch = s.nextInt();
			switch(ch) {
			case 1 :
				addUser();
				
				break;
			case 2:
				displayUser();
				break;
			case 3:
				searchUser();
				break;
			case 4:
				deleteUser();
				break;
			case 5:
				updateUser();
				break;
			}
				
		}while(ch!=0);
		
		

	}
	
	public static void addUser( ) {
		System.out.println("Enter User Id");
		int uId = s.nextInt();
		System.out.println("Enter User Name");
		String uName = s1.nextLine();
		System.out.println("Enter User Mail");
		String uMail = s1.nextLine();
		System.out.println("Enter User City");
		String uCity = s1.nextLine();
		System.out.println("Enter User Department");
		String uDept = s1.nextLine();
		lst.add(new Users(uId,uName,uMail,uCity,uDept));
		
		System.out.println("==================");
		System.out.println("User Added");
		System.out.println("==================");
		
	}
	
	public static void displayUser() {
		for(Users usr : lst) {
			System.out.println(usr);
		}

	}
	
	public static void searchUser() {
		boolean found = false;
		System.out.println("Enter the User Id to search: ");
		int uId1 = s.nextInt();
		for(Users usr : lst) {
			if(usr.getUserId() == uId1) {
				System.out.println("User Found..." + usr);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Record Not Found");
		}
	}
	
	public static void deleteUser() {
		boolean found = false;
		System.out.println("Enter the User Id to delete : ");
		int uId2 = s.nextInt();
		Iterator<Users> it = lst.iterator();
		while(it.hasNext()) {
			Users e = it.next();
			if(e.getUserId() == uId2) {
				it.remove();
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("Record Not Found");
		}
	}
	
	public static void updateUser() {
		boolean found = false;
		System.out.println("Enter the User Id to update : ");
		int uId3 = s.nextInt();
		for(Users usr : lst) {
			if(usr.getUserId() == uId3) {
				System.out.println("Enter User Id");
				int uId = s.nextInt();
				usr.setUserId(uId);
				System.out.println("Enter User Name");
				String uName = s1.nextLine();
				usr.setUserName(uName);
				System.out.println("Enter User Mail");
				String uMail = s1.nextLine();
				usr.setUserMail(uMail);
				System.out.println("Enter User City");
				String uCity = s1.nextLine();
				usr.setUserCity(uCity);
				System.out.println("Enter User Department");
				String uDept = s1.nextLine();
				usr.setUserDept(uDept);
				System.out.println("User Updated..." );
				found = true;
			}
		
		}
		if(!found) {
			System.out.println("Record Not Found");
		
		}
	}
}
