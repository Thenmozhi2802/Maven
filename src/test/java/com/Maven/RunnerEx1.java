package com.Maven;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RunnerEx1 extends Base {
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
	@BeforeTest
	private void methodG() {
		System.out.println("Before Test");
    }
	@AfterTest
	private void methodH() {
		System.out.println("After Test");
    }
	@BeforeSuite
	private void methodI() {
		System.out.println("Before Suite");
    }
	@AfterSuite
	private void methodJ() {
		System.out.println("After Suite");

	}
}
