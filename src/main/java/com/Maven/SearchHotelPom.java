package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom {
        private WebDriver driver;
        
        public WebDriver getDriver() {
			return driver;
		}
        @FindBy(xpath="//select[@name='location']")
	    private WebElement selectlocation1;

		public WebElement getSelectlocation1() {
			return selectlocation1;
		}
        @FindBy(id="hotels")
		private WebElement selecthotel1;
		public WebElement getSelecthotel1() {
			return selecthotel1;
		}
		@FindBy(id="room_type")
		private WebElement selectroomtype1;
        public WebElement getSelectroomtype1() {
			return selectroomtype1;
		}
		@FindBy(id="room_nos")
		private WebElement num_Of_Rooms1;
		public WebElement getNum_Of_Rooms1() {
			return num_Of_Rooms1;
		}
		@FindBy(id="datepick_in")
		private WebElement check_In1;
        
		public WebElement getCheck_In1() {
			return check_In1;
		}
		@FindBy(id="datepick_out")
		private WebElement check_out1;
		
		public WebElement getCheck_out1() {
			return check_out1;
		}
        @FindBy(id="adult_room")
		private WebElement adults_per_room1;

		public WebElement getAdults_per_room1() {
			return adults_per_room1;
		}
        @FindBy(id="child_room")
		private WebElement children_per_room1;
		
		public WebElement getChildren_per_room1() {
			return children_per_room1;
		}
		
		@FindBy(id="Reset")
		private WebElement reset;
		
		public WebElement getReset() {
			return reset;
		}
		@FindBy(xpath="//select[@name='location']")
	    private WebElement selectlocation;

		public WebElement getSelectlocation() {
			return selectlocation;
		}
        @FindBy(id="hotels")
		private WebElement selecthotel;
		public WebElement getSelecthotel() {
			return selecthotel;
		}
		@FindBy(id="room_type")
		private WebElement selectroomtype;
        public WebElement getSelectroomtype() {
			return selectroomtype;
		}
		@FindBy(id="room_nos")
		private WebElement num_Of_Rooms ;
		public WebElement getNum_Of_Rooms() {
			return num_Of_Rooms;
		}
		@FindBy(id="datepick_in")
		private WebElement check_In;
        
		public WebElement getCheck_In() {
			return check_In;
		}
		@FindBy(id="datepick_out")
		private WebElement check_out;
		
		public WebElement getCheck_out() {
			return check_out;
		}
        @FindBy(id="adult_room")
		private WebElement adults_per_room;

		public WebElement getAdults_per_room() {
			return adults_per_room;
		}
        @FindBy(id="child_room")
		private WebElement children_per_room;
		
		public WebElement getChildren_per_room() {
			return children_per_room;
		}
		
		@FindBy(id="Submit")
		private WebElement submit_button;
        
		public WebElement getSubmit_button() {
			return submit_button;
		}
        public SearchHotelPom(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
       }
