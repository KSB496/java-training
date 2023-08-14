package com.client;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.repo.AccountImpl;
import com.repo.AccountRepo;
import com.service.TransferService;


@Component
@Aspect
public class AppAdvice {

	@Around("execution (* com.service.TransferService.transferFunds(..))")
	public void callAround(ProceedingJoinPoint jp) throws Throwable {
		
		System.out.println("called before method " + Arrays.toString(jp.getArgs()));
		String s1 = (String) jp.getArgs()[1];
		String s2 = (String) jp.getArgs()[2];
		
		TransferService tsr = (TransferService) jp.getThis();
		AccountRepo repo = tsr.getRepo();
		
		System.out.println("before fund transfer balance in Account 101 : " +repo.findById(s1));
		System.out.println("before fund transfer balance in Account 102 : " +repo.findById(s2));
		
		jp.proceed();
		
		System.out.println("Called after ");
		System.out.println("before fund transfer balance in Account 101 : " +repo.findById((String)(jp.getArgs()[1])).getBalance());
		System.out.println("before fund transfer balance in Account 102 : " +repo.findById((String)(jp.getArgs()[2])).getBalance());
		
		System.out.println(repo.findAll());
	}
}
