package com.client;

import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.Account;
import com.domain.UserAccount;
import com.repo.AccountImpl;
import com.repo.AccountRepo;
import com.service.TransferService;
import com.service.TransferServiceImpl;


public class AppClient {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Account crystalacc = new Account("Crystal", 1000.50); 
		Account johnacc = new Account("John", 2500.99);
		Account sarahacc = new Account("Sarah", 150000);
		
		AccountRepo repo = (AccountRepo)context.getBean("ar");
		TransferService transfer = (TransferService)context.getBean("ts");
		
		repo.add(crystalacc);
		repo.add(johnacc);
		repo.add(sarahacc);

		
		transfer.transferFunds(500, "John", "Crystal");

		
//		System.out.println("all accounts--------------------");
//		Set<Account> acts= repo.findAll();
//		for (Account act: acts)
//			System.out.println(act);
//
//		UserAccount uacc = (UserAccount)context.getBean("uacc");
//		System.out.println(uacc.getAccountNumber());
//		System.out.println(uacc.getAccountType());
//		System.out.println(uacc.getOwnerName());
//		System.out.println(uacc.getBalance());
		context.close();
		
	}
}
