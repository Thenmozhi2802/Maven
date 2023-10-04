package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom {
        

		private WebDriver driver;
          
          public WebDriver getDriver() {
			return driver;
		}

		public WebElement getUserbox() {
			return userbox;
		}

		public WebElement getPassbox() {
			return passbox;
		}

		public WebElement getClick1() {
			return click1;
		}

		@FindBy(id="username")
          private WebElement userbox;
          
          @FindBy(id="password")
          private WebElement passbox;
          
          @FindBy(id="login")
          private WebElement click1;
          
          public AdactinPom(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
}
