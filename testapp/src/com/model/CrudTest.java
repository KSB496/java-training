
package com.model;



import static org.junit.Assert.assertEquals;

import java.util.Collections;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CrudTest {

	/*public static Users data(){
		return new Users(1,"aa","bb","cc","dd");
	}*/
	Users u1 = new Users(1,"aa","bb","cc","dd");
	
	@BeforeEach
	public void callBefore() {
		CRUDMain.lst.add(u1);
	}
	@Test
	public void testAddUser() {
		CRUDMain.addUser();
		int size = CRUDMain.lst.size();
		assertEquals(1,size);
	}
	
	
	@Test
	public void testSearchUser() {
		CRUDMain.searchUser();
		int size = CRUDMain.lst.size();
		assertEquals(1,size);
	}
	
	@Test
	public void testDeleteUser() {
		CRUDMain.deleteUser();
		int size = CRUDMain.lst.size();
		assertEquals(0,size);
	}
	
	@Test
	public void testUpdateUser() {
		CRUDMain.updateUser();
		int size = CRUDMain.lst.size();
		assertEquals(1,size);
	}
	
	@Test
	public void testDisplayUser() {
		CRUDMain.displayUser();
		int size = CRUDMain.lst.size();
		assertEquals(1,size);
	}
}
