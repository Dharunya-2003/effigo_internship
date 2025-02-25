package feb25_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_googleserach_usingdyanmic_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@role='combobox']")).sendKeys("testing");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Capture all suggestions using updated XPath
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        // Print the total number of suggestions
        System.out.println("Total number of suggestions in search box: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            String suggestion = list.get(i).getText().trim();
            System.out.println(list.get(i).getText());

            if (suggestion.equalsIgnoreCase("testing powder")) {
                Thread.sleep(3000);
                list.get(i).click();
                break;
            }
        }
     	
	}

}


//div[@class='aajZCb']