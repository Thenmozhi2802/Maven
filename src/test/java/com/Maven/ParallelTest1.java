package com.Maven;

import org.testng.annotations.Test;

public class ParallelTest1 {
	@Test
	private void methodC() {
		System.out.println("C");
		}
	
	@Test
	private void methodA(){
		System.out.println("A");	
	   }
}
