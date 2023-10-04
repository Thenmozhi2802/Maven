package com.Maven;

import org.testng.annotations.Test;

public class Dependency1 {
	@Test
	private void methodC() {
		System.out.println("C");
		}
	
	@Test(dependsOnMethods = "methodC")
	private void methodA() throws Exception{
		System.out.println("A");
		throw new Exception();    }
	
	
}
