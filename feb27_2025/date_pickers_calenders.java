package feb27_2025;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_pickers_calenders {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		// to select  departure date
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-February-2025']//div[text()='28']")).click();
		
		// to select the return date
		 driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
	     driver.findElement(By.xpath("//div[@data-testid='undefined-month-March-2025']//div[text()='10']")).click();
		
		

	}

}
