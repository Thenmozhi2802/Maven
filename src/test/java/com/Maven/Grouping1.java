package com.Maven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Grouping1 {
	@Test(groups = "Sanity")
	private void methodC() {
		System.out.println("C");
		}
	@Test
	private void methodB() {     
		System.out.println("B");
    }
	@Test(groups = "Sanity")
	private void methodA() {
		System.out.println("A");
    }
	
	@Test
	private void methodD() {
		System.out.println("D");
    }
}
