package org.stepdef;
import org.openqa.selenium.WebDriver;

import com.Maven.Base;
import com.Maven.Pom;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefEx extends Base{
	
	public WebDriver driver;
	public Pom a;
	@Given("Launch browser and Url")
	public void launch_browser_and_url() {
		 driver= browserLaunch(url);
	}
	@Given("pass the username")
	public void pass_the_username() {
		a=new Pom(driver);
	    KeyToSend(a.getUserName(),"Thenmozhi");
	}
	@Given("pass the password")
	public void pass_the_password() {
		a=new Pom(driver);
	    KeyToSend(a.getPassword(),"then@123");
	}
	//@Then("click the login")
	//public void click_the_login() {
	   
	//}
	@Then("validate the page")
	public void validate_the_page() {
	    
	}
	@Given("pass the username {string}")
	public void pass_the_username(String username) {
		a=new Pom(driver);
	    KeyToSend(a.getUserName(),username);
	}
	@Given("pass the password {string}")
	public void pass_the_password(String password) {
		a=new Pom(driver);
	    KeyToSend(a.getPassword(),password);
	}
	@After
	public void close() {
		System.out.println("I am closed");

	}
}
