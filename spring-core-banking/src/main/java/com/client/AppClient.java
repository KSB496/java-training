package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.Account;
import com.repo.AccountImpl;
import com.repo.AccountRepo;
import com.service.TransferService;
import com.service.TransferServiceImpl;

public class AppClient {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		AccountRepo repo = (AccountRepo)context.getBean("ar");
		TransferService s1 = (TransferService)context.getBean("ts");
		
		repo.add(new Account("101",15000));
		repo.add(new Account("102",20000));
		
		System.out.println("before fund transfer balance in Account 101 : " +repo.findById("101").getBalance());
		System.out.println("before fund transfer balance in Account 101 : " +repo.findById("102").getBalance());
		
		s1.transferFunds(5000, "101", "102");
	
		System.out.println("After fund transfer balance in Account 101 : " +repo.findById("101").getBalance());
		System.out.println("After fund transfer balance in Account 101 : " +repo.findById("102").getBalance());
		
		System.out.println(repo.findAll());
	
	}

}
