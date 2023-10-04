package com.Maven;

import org.testng.annotations.Test;

public class InvocationCount1 {
	@Test
	private void methodC() {
		System.out.println("C");
		}
	
	@Test(invocationCount = 5)
	private void methodA() {
		System.out.println("A");
	   }
	
}
