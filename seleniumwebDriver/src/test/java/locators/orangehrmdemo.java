package locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
				WebDriver driver= new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				
				
				//wait to handle the delays
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
				
				// this is for login page
				 driver.findElement(By.name("username")).sendKeys("Admin");
				 driver.findElement(By.name("password")).sendKeys("admin123");
				 driver.findElement(By.xpath("//*[@type='submit']")).click();
			        boolean isDashboardDisplayed = driver.findElement(By.xpath("//h6[.='Dashboard']")).isDisplayed();
			        if (isDashboardDisplayed) {
			            System.out.println("Login successful  dashboard is displayed");
			        } else {
			            System.out.println("Login failed");
			        }
			        
			        //to wait  for 3sec before logout
			        Thread.sleep(3000);
			        
			        // this is for logout page
			        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			        driver.findElement(By.xpath("//a[.='Logout']")).click();
			        boolean isloginpagedisplayed=driver.findElement(By.name("username")).isDisplayed();
			        if (isloginpagedisplayed) {
			            System.out.println("Logout Successful it is redirected to login page");
			        } else {
			            System.out.println("Logout failed");
			        }
			        

				 
				 
	}

	
}
