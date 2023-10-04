package com.Maven;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends GeneralConstants{
	
	public static WebDriver driver;
        public static  WebDriver  browserLaunch(String url) {
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get(url);
         return driver;
	}
	public static void KeyToSend(WebElement ref, String keys){
		ref.sendKeys(keys);
	}
	public static void selectByText(WebElement ref, String text) {    //we use drop down here so obj for select class
		Select s=new Select(ref);
	    s.selectByVisibleText(text);
	}
	public static void click(WebElement ref) {
		ref.click();    //if n login click pana porana adhukana ref path eduthu method aa runner class la call pannanum.click(pass)
	}
	
}

