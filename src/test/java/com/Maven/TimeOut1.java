package com.Maven;

import org.testng.annotations.Test;

public class TimeOut1 {
	@Test
	private void methodC() {
		System.out.println("C");
		}
	
	@Test(timeOut = 2000)
	private void methodA() throws InterruptedException {
		System.out.println("A");
		Thread.sleep(4000);
	   }
}
