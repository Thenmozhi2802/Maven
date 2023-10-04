package com.adactin.stepdefinition;
import org.openqa.selenium.WebDriver;
import com.Maven.AdactinBase;
import com.Maven.AdactinPom;
import com.Maven.BookaHotelPom;
import com.Maven.BookingConformPom;
import com.Maven.Pom;
import com.Maven.SearchHotelPom;
import com.Maven.SelectHotelPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdactinStepDef extends AdactinBase{
	public WebDriver driver;
	public AdactinPom a;
	public SearchHotelPom b;
	public SelectHotelPom c;
	public BookaHotelPom d;
	public BookingConformPom e;
	
	@Given("Launch browser and Url")
	public void launch_browser_and_url() {
		driver=browserLaunch(url);
	}
	@Given("pass the username")
	public void pass_the_username() {
		a=new AdactinPom(driver);
		KeysToSend(a.getUserbox(),"thenmozhii123");
		
	}
	@Given("pass the password")
	public void pass_the_password() {
		a=new AdactinPom(driver);
		KeysToSend(a.getPassbox(),"AB@123");
	}
	@Then("click the login")
	public void click_the_login() {
		a=new AdactinPom(driver);
		 mouse_click(a.getClick1());
	}
	@Then("select the location")
	public void select_the_location() {
		b=new SearchHotelPom(driver);
		selectByVisibleText_Dropdown( b.getSelectlocation1(),"Sydney");
	}
	@Then("select the hotel")
	public void select_the_hotel() {
		b=new SearchHotelPom(driver);
		selectByVisibleText_Dropdown(b.getSelecthotel1(),"Hotel Hervey");
	}
	@Then("select the roomtype")
	public void select_the_roomtype() {
		b=new SearchHotelPom(driver);
		selectByVisibleText_Dropdown(b.getSelectroomtype1(),"Super Deluxe");
	}
	@Then("choose no of rooms")
	public void choose_no_of_rooms() {
		b=new SearchHotelPom(driver);
		selectByVisibleText_Dropdown(b.getNum_Of_Rooms1(),"3 - Three");
	}
	@Then("checkin date")
	public void checkin_date() {
		b=new SearchHotelPom(driver);
		KeysToSend(b.getCheck_In1(),"17-09-2023");
	}
	@Then("checkout date")
	public void checkout_date() {
		b=new SearchHotelPom(driver);
		KeysToSend(b.getCheck_out1(),"18-09-2023");
	}
	@Then("adults per room")
	public void adults_per_room() {
		b=new SearchHotelPom(driver);
		selectByVisibleText_Dropdown(b.getAdults_per_room1(),"4 - Four");
	}
	@Then("children per room")
	public void children_per_room() {
		b=new SearchHotelPom(driver);
		selectByVisibleText_Dropdown(b.getChildren_per_room1(),"2 - Two");
	}
	@Then("click the search")
	public void click_the_search() {
		b=new SearchHotelPom(driver);
		mouse_click(b.getSubmit_button());
	}
	@Then("select hotel")
	public void select_hotel() {
	    c=new SelectHotelPom(driver);
	    checkbox(c.getSelect_RadioButton());
    }
	@Then("click continue")
	public void click_continue() {
	    c=new SelectHotelPom(driver);
	    mouse_click(c.getContinue1());
	}
	@Then("enter firstname")
	public void enter_firstname() {
	    d=new BookaHotelPom(driver);
	    KeysToSend(d.getFirst_name(),"Thenmozhi");
	}
	@Then("enter lastname")
	public void enter_lastname() {
		d=new BookaHotelPom(driver);
		KeysToSend(d.getLast_name(),"Sampath");
	}
	@Then("enter billing address")
	public void enter_billing_address() {
		d=new BookaHotelPom(driver);
		KeysToSend(d.getBilling_address(),"23/24,Santhi colony, AnnaNagar west,Thirumangalam,Chennai-600301");
    }
	@Then("enter creditcard num")
	public void enter_creditcard_num() {
		d=new BookaHotelPom(driver);
		KeysToSend(d.getCreditcard_num(),"4500 3456 3467 5678");
    }
	@Then("select creditcard type")
	public void select_creditcard_type() {
		d=new BookaHotelPom(driver);
		selectByVisibleText_Dropdown(d.getCredit_card_type(),"Master Card");
	}
	@Then("select expiry date")
	public void select_expiry_date() {
		d=new BookaHotelPom(driver);
		selectByVisibleText_Dropdown(d.getExp_Select_Month(),"April");
        selectByVisibleText_Dropdown(d.getExp_Select_year(),"2030");
	}
	@Then("enter ccv num")
	public void enter_ccv_num() {
		d=new BookaHotelPom(driver);
		 KeysToSend(d.getCcv_num(),"468");
	      
	}
	@Then("click book now")
	public void click_book_now() {
		d=new BookaHotelPom(driver);
		mouse_click(d.getBook_Now());
	}
	@Then("click logout")
	public void click_logout() {
	    e=new BookingConformPom(driver);
	    mouse_click(e.getLogout()); 
	}


}
