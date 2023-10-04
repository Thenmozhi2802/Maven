package com.Maven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
	@Test
     private void methodA() {
		System.out.println("A");
    }
	@Parameters({"username","password"})
	@Test
     private void methodC(String user,String password) {
		System.out.println(user+":"+password);
    }
}
