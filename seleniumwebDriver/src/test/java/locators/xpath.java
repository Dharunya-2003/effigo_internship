package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute		
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		
		//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with 'and' 'or' operator
		
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirt");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='abc']")).sendKeys("T-shirt");
		
		//xpath with inner text - text()
		
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		//boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//xpath with contains    (here we can memtion only partial value1)
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		//xpath with starts-with	
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		
		//chained Xpath
		boolean status=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
	}
}
