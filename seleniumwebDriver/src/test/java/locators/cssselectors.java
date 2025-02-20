package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		
		
		//tag id   tag#id   here input is the tag name
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	
		//tag class   tag.classname (here we can locate  group of elemets too)
	     driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
	//or we can remove the tag name
	//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
	
	//tag attribute    tag[attribute='value']
	//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
	//tag class attribute
		
		//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("t-shirts");
			
	}

}
