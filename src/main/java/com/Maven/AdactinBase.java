package com.Maven;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBase extends AdactinGeneralConstants{
	      public static WebDriver driver;
          public static WebDriver browserLaunch(String url) {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			return driver;
			}
          public static void KeysToSend(WebElement ref,String key) {
			ref.sendKeys(key);
           }
          public static void mouse_click(WebElement ref) {
			ref.click();
          }
          public static void selectByVisibleText_Dropdown(WebElement ref,String text) {
        	  Select s=new Select(ref);
        	  s.selectByVisibleText(text);
          }
          
          public static void checkbox(WebElement ref) {
        	  ref.click();
          }
          
          public static void Close(WebDriver ref) {
        	  ref.close();
          }
          public static void Quit(WebDriver ref) {
        	  ref.quit();
          }
}
