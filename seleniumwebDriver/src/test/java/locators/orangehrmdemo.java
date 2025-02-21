package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmdemo {

	public static void main(String[] args) 
	{
		
				WebDriver driver= new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				
				
				//wait to handle the delays
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
				
				
				 driver.findElement(By.name("username")).sendKeys("Admin");
				 driver.findElement(By.name("password")).sendKeys("admin123");
				 driver.findElement(By.xpath("//*[@type='submit']")).click();
			        boolean isDashboardDisplayed = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
			        if (isDashboardDisplayed) {
			            System.out.println("Login Successful Dashboard is displayed!");
			        } else {
			            System.out.println("Login Failed Dashboard is NOT displayed!");
			        }

				 
				 
	}

	
}
