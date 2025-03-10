package mar_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
	
	WebDriver driver;
	
	//constructor
	login_page  (WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	 

 By text_username=By.xpath("//input[@placeholder='Username']");
 By text_password=By.xpath("//input[@placeholder='Password']");
 By button_logon=By.xpath("//button[normalize-space()='Login']");
	
// Action methods
 
 public void setUserName(String user)
 {
	 driver.findElement(text_username).sendKeys(user);
	 
 }
 
 public void setPassword(String pwd)
 {
	 driver.findElement(text_password).sendKeys(pwd);
	 
 }
 
 public void Click_login() 
 {
	 driver.findElement(button_logon).click();
	 
 }
 
	

}
