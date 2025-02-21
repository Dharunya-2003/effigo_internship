package handle_files;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_files {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:/Users/dharu/OneDrive/Desktop/7th sem cerrificate");

	}

}
