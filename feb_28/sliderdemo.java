package feb_28;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderdemo
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;

		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		// for min slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println(" default location of the slider "+min_slider.getLocation());
		//System.out.println("location of the slider"+min_slider.getLocation().getX());
		//System.out.println("location of the slider"+min_slider.getLocation().getY());		
		// what i got is (59, 293)
		action.dragAndDropBy(min_slider,100,293).perform();
		System.out.println("location of the slider after moving "+min_slider.getLocation());
		
		Thread.sleep(2000);
		
		// for max _slider
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println(" default location of the slider "+max_slider.getLocation());
		//System.out.println("location of the slider"+min_slider.getLocation().getX());
		//System.out.println("location of the slider"+min_slider.getLocation().getY());		
		// what i got is (317,233)
		action.dragAndDropBy(max_slider,-93,0).perform();
		System.out.println("location of the slider after moving "+max_slider.getLocation());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
