package com.Maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore1 {
	@BeforeMethod
	private void methodc() {
		System.out.println("Before Method");
		}
	@Test
	private void methodB() {     //here methoB is the testcase
		System.out.println("B");

	}
	@AfterMethod
	private void methodA() {
		System.out.println("After Method");
    }
	//@Ignore
	//@Test(enabled=false)
	@Test
	private void methodD() {
		System.out.println("D");
    }
	@BeforeClass
	private void methodE() {
		System.out.println("BeforeClass");
    }
	@AfterClass
	private void methodF() {
		System.out.println("AfterClass");
    }
}
