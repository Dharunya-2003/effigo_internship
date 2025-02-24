package date24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class readpropfile
{   
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		 Properties prop = new Properties();
	        FileInputStream ip = new FileInputStream("C:\\Users\\dharu\\OneDrive\\Desktop\\clg\\seleniumwebDriver\\src\\test\\java\\date24\\config.properties");
	        prop.load(ip);
	        System.out.println(prop.getProperty("name"));
	        System.out.println(prop.getProperty("age"));
	        
	        String url= prop.getProperty("url");
	        System.out.println(url);
	        String browserName= prop.getProperty("browser");
	        System.out.println(browserName);
	        
	        //launch chrome
	        if(browserName.equals("chrome"))
	        {
	         driver=new ChromeDriver();
	        }
	        else if(browserName.equals("FF"))
	        {
	        	driver=new FirefoxDriver();
	        }
	        else if(browserName.equalsIgnoreCase("IE"))
	        {
	        	 driver = new InternetExplorerDriver();
	        }
	        else
	        {
	        	System.out.println("Invalid browser name specified in config file");
	            return;
	        }
	        driver.get(url);
	        driver.manage().window().maximize();
	        
	        
	        // for login
	        driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
	        driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
	        driver.findElement(By.xpath(prop.getProperty("login_button_xpath"))).click();
	        
	        Thread.sleep(3000);
	        boolean isLoginSuccessful = driver.findElement(By.className("title")).isDisplayed();
	        if (isLoginSuccessful) 
	        {
	            System.out.println("login Successful");
	        }
	        else 
	        {
	            System.out.println("login failed.");
	        }
	        
	        
	        //for logout process
	        driver.findElement(By.xpath(prop.getProperty("logout_menu_xpath"))).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(prop.getProperty("logout_button_xpath"))).click();
	        
	        boolean isLoginPageDisplayed = driver.findElement(By.xpath(prop.getProperty("username_xpath"))).isDisplayed();
	        if (isLoginPageDisplayed) 
	        {
	            System.out.println("logout Successful");
	        } 
	        else
	        {
	            System.out.println("logout Failed.");
	        }        

	}

}
