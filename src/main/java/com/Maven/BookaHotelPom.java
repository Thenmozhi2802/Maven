package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotelPom {
         private WebDriver driver;
         
         public WebDriver getDriver() {
			return driver;
		}

		public WebElement getFirst_name() {
			return first_name;
		}

		public WebElement getLast_name() {
			return last_name;
		}

		public WebElement getBilling_address() {
			return billing_address;
		}

		public WebElement getCreditcard_num() {
			return creditcard_num;
		}

		public WebElement getCredit_card_type() {
			return Credit_card_type;
		}

		public WebElement getExp_Select_Month() {
			return Exp_Select_Month;
		}

		public WebElement getExp_Select_year() {
			return Exp_Select_year;
		}

		public WebElement getCcv_num() {
			return ccv_num;
		}

		public WebElement getBook_Now() {
			return Book_Now;
		}

		@FindBy(id="first_name")
         private WebElement first_name;
         
         @FindBy(id="last_name")
         private WebElement last_name;
         
         @FindBy(id="address")
         private WebElement billing_address;
         
         @FindBy(id="cc_num")
         private WebElement creditcard_num;
         
         @FindBy(id="cc_type")
         private WebElement Credit_card_type;
         
         @FindBy(id="cc_exp_month")
         private WebElement Exp_Select_Month;
         
         @FindBy(id="cc_exp_year")
         private WebElement Exp_Select_year;
         
         @FindBy(id="cc_cvv")
         private WebElement ccv_num;
         
         @FindBy(id="book_now")
         private WebElement Book_Now;
         
         public BookaHotelPom(WebDriver driver) {
 			this.driver=driver;
 			PageFactory.initElements(driver, this);
}
}
