package com.Maven;

import org.testng.annotations.Test;

public class ExpectedException1 {
	@Test
	private void methodC() {
		System.out.println("C");
		}
	
	@Test(expectedExceptions = Exception.class)//or(timeOut=2000;expectedExceptions=Exception.class)
	private void methodA() throws Exception {
		System.out.println("A");
		throw new Exception();
		
	   }
}
