package mar_3;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShot {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();	
		// 1 full page ss
		// here in this method we are taking ss from  the takescreenshot method 
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		//  actual path   C:\Users\dharu\OneDrive\Desktop\clg\seleniumwebDriver\screenshot
		//  File(System.getProperty("user.dir"  this returns crt project loction dynamically
		
		File tragetfile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		
		sourcefile.renameTo(tragetfile);  // copysouce file to taget file
		
		// 2 capture the ss of the specific section   here getScreenshotAs we are calling from the   webelement method
		WebElement featuresProdcts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		 File sourcefile1=featuresProdcts.getScreenshotAs(OutputType.FILE);

			File tragetfile1=new File(System.getProperty("user.dir")+"\\screenshot\\featuredproducts.png");
			
			sourcefile1.renameTo(tragetfile1); 			
			// 3 capture the ss of the webelement
			
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		 File sourcefile2=logo.getScreenshotAs(OutputType.FILE);

			File tragetfile2=new File(System.getProperty("user.dir")+"\\screenshot\\weblelementss.png");
			
			sourcefile2.renameTo(tragetfile2); 
		 driver.quit();
		

	}

}
