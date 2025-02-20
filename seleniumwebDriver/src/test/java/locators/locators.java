package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		//name
			driver.findElement(By.name("search")).sendKeys("Mac");
		
		// id
		 //boolean logoDisplayedstatus=driver.findElement(By.id("app")).isDisplayed();
		// System.out.println(logoDisplayedstatus);
		
		//linktext and partiallinktext
		//driver.findElement(By.linkText("Sell")).click();
	//	driver.findElement(By.partialLinkText("Sel")).click();
		
		// when we want capture group of elements we need to give  find elements
		//classname
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));

		//System.out.println("total number of header links:"+ headerLinks.size());
				
			
		//tag name
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("total number of  links:"+ links.size());
		}

}
