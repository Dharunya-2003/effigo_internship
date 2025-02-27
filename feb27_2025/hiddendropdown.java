package feb27_2025;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hiddendropdown {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        // Login
	        driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        driver.findElement(By.xpath("//*[@type='submit']")).click();

	        // Navigate to PIM > Employee List
	        driver.findElement(By.xpath("//span[text()='PIM']")).click();
	        
	        
	        // Explicit wait for the dropdown
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//label[text()='Employment Status']/../../div[2]//div[1]//div[1]//div")));
	        dropdown.click(); // Open dropdown

	        // Wait for all dropdown options to be visible
	        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
	                By.xpath("//label[text()='Employment Status']/../../div[2]//div[2]//div")));

	        // Iterate and select the required option
	        for (WebElement option : options) {
	            if (option.getText().trim().equals("Full-Time Permanent")) {
	                option.click();
	                System.out.println("Selected: " + option.getText());
	                break;
	            }
	        }
	        

	}

}
