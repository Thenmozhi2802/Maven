package com.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinRunnerEx extends AdactinBase {
         public static void main(String[] args) {
         WebDriver driver=browserLaunch("https://adactinhotelapp.com/");
         //WebElement userbox=driver.findElement(By.id("username"));
        // KeysToSend(userbox,"thenmozhii123");
        // WebElement passbox=driver.findElement(By.id("password"));
        // KeysToSend(passbox,"AB@123");
        // WebElement click1=driver.findElement(By.id("login"));
        // click(click1);
        //WebElement click2=driver.finfElement(By.id("location"));
        //click(click2);
         
         SignUp_Pom f=new SignUp_Pom(driver);
         mouse_click(f.getNew_reg());
         
         AdactinPom a=new AdactinPom(driver);
         KeysToSend(a.getUserbox(),"thenmozhii123");
         KeysToSend(a.getPassbox(),"AB@123");
         mouse_click(a.getClick1());
         SearchHotelPom b=new SearchHotelPom(driver);
         selectByVisibleText_Dropdown( b.getSelectlocation1(),"Sydney");
         selectByVisibleText_Dropdown(b.getSelecthotel1(),"Hotel Hervey");
         selectByVisibleText_Dropdown(b.getSelectroomtype1(),"Super Deluxe");
         selectByVisibleText_Dropdown(b.getNum_Of_Rooms1(),"3 - Three");
         KeysToSend(b.getCheck_In1(),"01-09-2023");
         KeysToSend(b.getCheck_out1(),"05-09-2023");
         selectByVisibleText_Dropdown(b.getAdults_per_room1(),"4 - Four");
         selectByVisibleText_Dropdown(b.getChildren_per_room1(),"2 - Two");
         mouse_click(b.getReset());
        
         selectByVisibleText_Dropdown( b.getSelectlocation(),"Sydney");
         selectByVisibleText_Dropdown(b.getSelecthotel(),"Hotel Hervey");
         selectByVisibleText_Dropdown(b.getSelectroomtype(),"Super Deluxe");
         selectByVisibleText_Dropdown(b.getNum_Of_Rooms(),"3 - Three");
         KeysToSend(b.getCheck_In(),"01-09-2023");
         KeysToSend(b.getCheck_out(),"02-09-2023");
         selectByVisibleText_Dropdown(b.getAdults_per_room(),"4 - Four");
         selectByVisibleText_Dropdown(b.getChildren_per_room(),"2 - Two");
         mouse_click(b.getSubmit_button());
         
         SelectHotelPom c=new SelectHotelPom(driver);
         checkbox(c.getSelect_RadioButton());
         mouse_click(c.getContinue1());
         
         BookaHotelPom d= new BookaHotelPom(driver);
         KeysToSend(d.getFirst_name(),"Thenmozhi");
         KeysToSend(d.getLast_name(),"Sampath");
         KeysToSend(d.getBilling_address(),"23/24,Santhi colony, AnnaNagar west,Thirumangalam,Chennai-600301");
         KeysToSend(d.getCreditcard_num(),"4500 3456 3467 5678");
         selectByVisibleText_Dropdown(d.getCredit_card_type(),"Master Card");
         selectByVisibleText_Dropdown(d.getExp_Select_Month(),"April");
         selectByVisibleText_Dropdown(d.getExp_Select_year(),"2030");
         KeysToSend(d.getCcv_num(),"468");
         mouse_click(d.getBook_Now());
         
         BookingConformPom e=new BookingConformPom(driver);
         mouse_click(e.getLogout());  
         Close(driver);
         Quit(driver);
}
}