package com.Maven;

import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = -1)
	   private void methodB() {
		System.out.println("B");
     }
	@Test(priority = 0)
	   private void methodA() {
		System.out.println("A");

	}
}
