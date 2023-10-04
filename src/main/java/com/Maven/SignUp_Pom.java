package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Pom {
   
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNew_reg() {
		return new_reg;
	}

	@FindBy(linkText="//a[text()='New User Register Here']")
    private WebElement new_reg;
    public SignUp_Pom(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
}
}

