package com.client;

import org.springframework.stereotype.Component;

import com.repo.AccountRepo;
import com.service.TransferService;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class AppAdvice {
	@Around("execution(* com.service.TransferService.transferFunds(..)))")
	public Object callAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("----------------------- before -----------------------");
		System.out.println(Arrays.toString(jp.getArgs()));
		TransferService ts = (TransferService)jp.getThis();
		AccountRepo ar = ts.getRepo();
		System.out.println(ts.getRepo().findById(     (String)(jp.getArgs()[1])     ));
		System.out.println(ts.getRepo().findById(     (String)(jp.getArgs()[2])     ));
		System.out.println("------------------------------------------------------");
		Object retVal = jp.proceed();
		System.out.println("----------------------- after ------------------------");
		System.out.println(ts.getRepo().findById(     (String)(jp.getArgs()[1])     ));
		System.out.println(ts.getRepo().findById(     (String)(jp.getArgs()[2])     ));
		System.out.println(retVal);
		System.out.println("------------------------------------------------------");
		return retVal;
	}
}
