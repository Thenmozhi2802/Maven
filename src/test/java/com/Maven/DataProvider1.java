package com.Maven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider1 {
	@Test
    private void methodA() {
		System.out.println("A");
   }
	@Test(dataProvider="data1")
    private void methodC(String user,String password) throws Exception {
		System.out.println(user+":"+password);
   }
	@DataProvider
	@Test
	private Object[][] data1() {
		return new Object[][]
				{{"Thenmozhi","Then@123"},{"GiriDharan","Giri@123"}};

	}
}
