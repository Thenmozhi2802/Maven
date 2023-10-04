package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConformPom {
    private WebDriver driver;
    
    public WebDriver getDriver() {
		return driver;
	}

    @FindBy(id="logout")
    private WebElement logout;

	
	
	public WebElement getLogout() {
		return logout;
	}



	public BookingConformPom(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
}
}