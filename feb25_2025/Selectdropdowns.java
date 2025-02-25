package feb25_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdowns {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryEle =driver.findElement(By.id("country"));
		Select drpcountry= new Select(drpcountryEle);
		
		//drpcountry.selectByVisibleText("France");
		//drpcountry.selectByValue("france");
		//drpcountry.selectByIndex(4);
		
		List< WebElement> options=drpcountry.getOptions();
		System.out.println("total number of optios in the drop down menu  "+ options.size());
		
		//printing the options
		
		for( int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
					
		}
		
		
		
	
		
		
	}

}
