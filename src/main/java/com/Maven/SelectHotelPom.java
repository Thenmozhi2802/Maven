package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPom {
        private WebDriver driver;


		public WebDriver getDriver() {
			return driver;
		}
		
		@FindBy(id="radiobutton_0")
		private WebElement select_RadioButton;
	
		public WebElement getSelect_RadioButton() {
			return select_RadioButton;
		}
		
		
		@FindBy(id="continue")
		private WebElement continue1;
		
		
		public WebElement getContinue1() {
			return continue1;
		}


		public SelectHotelPom(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
            
}
}
