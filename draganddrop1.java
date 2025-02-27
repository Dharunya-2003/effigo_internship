package mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop1 {

	public static void main(String[] args)
	{
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://demo.guru99.com/test/drag_drop.html");

	        Actions action = new Actions(driver);
	        
	        //draggable elements
	        
	      // driver.findElement(By.xpath("//*[@id='credit2']/a"));
	       
	       //drop zones
	       //driver.findElement(By.xpath("//*[@id='bank']//li"));
	       
	        
	        action.clickAndHold(driver.findElement(By.xpath("//*[@id='credit2']/a"))).moveToElement(driver.findElement(By.xpath("//*[@id='bank']//li"))).release().perform();
	        action.clickAndHold(driver.findElement(By.xpath("//*[@id='credit1']/a"))).moveToElement(driver.findElement(By.xpath("//*[@id='loan']//li"))).release().perform();
	        action.clickAndHold(driver.findElement(By.xpath("//*[@id='fourth']/a"))).moveToElement(driver.findElement(By.xpath("//*[@id='amt7']"))).release().perform();
	        action.clickAndHold(driver.findElement(By.xpath("//*[@id='fourth']/a"))).moveToElement(driver.findElement(By.xpath("//*[@id='amt8']"))).release().perform();
	       


	}

}
//action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().perform();
