package mar_10;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 
{
WebDriver driver;
	
	//constructor
loginpage2   (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

// Locators
  @FindBy(xpath="//input[@placeholder='Username']")
   WebElement text_username;
  
  @FindBy(xpath="//input[@placeholder='Password']")
  WebElement text_password;
  
  @FindBy(xpath="//button[normalize-space()='Login']")
  WebElement button_login;
  
  
  @FindBy(tagName="a")
  List<WebElement>links;
  
//Action methods
  
public void setUserName(String user)
{
	 text_username.sendKeys(user);
	 
}

public void setPassword(String pwd)
{
	 (text_password).sendKeys(pwd);
	 
}

public void Click_login() 
{
	button_login.click();
	 
}
  
	

}
