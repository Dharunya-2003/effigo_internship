package feb_28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openlinkInNewTab {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reglink =driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions action =new Actions(driver);
		//ctrl+reglink
		action.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		
		//switching to registration window page
		List<String> ids=new ArrayList(driver.getWindowHandles());
		//switch to registration page
		driver.switchTo().window(ids.get(1));
		
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("dharunya");
		//switch to home page
				driver.switchTo().window(ids.get(0));
		
	

		
		

	}

}
