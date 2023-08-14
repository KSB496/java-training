package com.example.springweb;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserEnc {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
		System.out.println(bpe.encode("admin123"));
		System.out.println(bpe.encode("manager123"));
		System.out.println(bpe.encode("emp123"));
		System.out.println(bpe.encode("qa123"));
		System.out.println(bpe.encode("hs123"));
	}
	
}
