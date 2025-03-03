package mar_3;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {

    public static void main(String[] args) throws InterruptedException {
        // Set ChromeOptions for headless execution
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");         
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
        driver.get("https://demo.nopcommerce.com/");  
        
        String actualtitle = driver.getTitle();
        Thread.sleep(5000);
        System.out.println("Page title: " + actualtitle);       
        String expectedTitle = "nopCommerce demo store. Home page title";  
        
       
        if (actualtitle.equals(expectedTitle)) {
            System.out.println(" Test Passed title matches.");
        } else {
            System.out.println(" Test Failed expected " + expectedTitle + " but got " + actualtitle );
        }

       // driver.quit();
        
    }
}
