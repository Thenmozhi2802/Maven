package com.Maven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation1 {
	@Test
   private void methodC() {
	System.out.println("C");
	Assert.assertTrue(false);
	System.out.println("Verified");
}
	@Test
   private void methodA() {
	SoftAssert a=new SoftAssert();	
	System.out.println("A");
	a.assertTrue(false);
	System.out.println("Verified");
}
}
