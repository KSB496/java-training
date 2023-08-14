package com.app;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {

	public static String log;
	private CountDownLatch latch = new CountDownLatch(1);
	@Rule
	public Timeout globalTimeout = Timeout.seconds(10);
	
	@Test
	public void testSleepLong() throws InterruptedException{
		log += "demo1";
		TimeUnit.SECONDS.sleep(20);
	}
	
	public void testBlockForever( ) throws InterruptedException {
		log += "demo1";
		latch.await();
	}
	
}
