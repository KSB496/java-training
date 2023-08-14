package com.client;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AppAdvice {

	//@Before("execution (* com.client.Welcome.*(..))")
	public void callBefore() {
		System.out.println("called before method");
	}
	//@After("execution (* com.client.WelcomeImpl.sayHi(..))")
	public void callAfter() {
		System.out.println("called after method");
	}
	@Around("execution (* com.client.WelcomeImpl.sayWelcome(..))")
	public Object callAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("called before method" + Arrays.toString(jp.getArgs()));
		Object data = jp.proceed();
		System.out.println("Called after " + data);
		return data;
	}
}
