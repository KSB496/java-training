package com.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.pack.InsertDemo;
import com.pack.LoadData;

public class UIDMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do {
			System.out.println("Type 1 to Insert User");
			System.out.println("Type 2 to Delete User");
			System.out.println("Type 3 to Update User");
			System.out.println("Type 4 to Load User");
			
			ch = sc.nextInt();
			switch(ch) {
			case 1 :
				InsertDemo i = new InsertDemo();
				i.main(null);
				
				InsertDemo.main(null);

				break;
			case 2:
				DeleteDemo d = new DeleteDemo();
				d.main(null);
				break;
			case 3:
				UpdateDemo u = new UpdateDemo();
				u.main(null);
				break;
			case 4:
				LoadData l = new LoadData();
				l.main(null);
			
			}
				
		}while(ch!=0);

	}

}
