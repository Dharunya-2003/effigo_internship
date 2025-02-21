package mousemovement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovementconcept {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[.='Add-ons']"))).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Taxi")).click();

		
		
		
	}

}
