package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.domain.Account;
import com.repo.AccountRepo;
import com.service.TransferService;

public class AppClient {

	public static void main(String[] args) {
	
		//ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountRepo repo = (AccountRepo)context.getBean("ar");
		TransferService s1 = (TransferService)context.getBean("ts");
		
		repo.add(new Account("abc",10000));
		repo.add(new Account("102",20000));
		
		//System.out.println("before fund transfer balance in Account 101 : " +repo.findById("101").getBalance());
		//System.out.println("before fund transfer balance in Account 102 : " +repo.findById("102").getBalance());
		
		s1.transferFunds(5000, "abc", "102");
	
		//System.out.println("After fund transfer balance in Account 101 : " +repo.findById("101").getBalance());
		//System.out.println("After fund transfer balance in Account 102 : " +repo.findById("102").getBalance());
		
		//System.out.println(repo.findAll());
	
	}

}
