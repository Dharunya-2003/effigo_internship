package mar_3;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class enableextensionAtRunTime {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		
		File file =new File("C:\\Users\\dharu\\Downloads\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
        options.addExtensions(file); 
	
	WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
    driver.get(" https://expired.badssl.com/");  
    

	}

}
