package feb25_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap_dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//1.to select a single  option
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2.capture all the options and find put the size
		List < WebElement> options =driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
		System.out.println("number of options:  "  +options.size() );
		
		
		//printing options from the dropdown
		/*
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		*/
		
		
		// select multiple options
		
		for(WebElement op:options)
			
		{
			
			if(op.getText().equals("Java") ||op.getText().equals("Python"))
			{
				op.click();
				Thread.sleep(1000);
			}
		}
		
		
		

	}

}
