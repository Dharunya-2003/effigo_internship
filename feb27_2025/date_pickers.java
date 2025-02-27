package feb27_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_pickers 
{
    static void selectfuturedates(WebDriver driver, String month, String year, String date) 
    {
        while(true)
        {
            // Get current month and year
            String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
             
            if (currentmonth.equals(month) && currentyear.equals(year))
            {
                break;
            }
            
            // Click next button to move to the future month
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
    }

    static void selectpastdates(WebDriver driver, String month, String year, String date) 
    {
        while(true)
        {
            // Get current month and year
            String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
             
            if (currentmonth.equals(month) && currentyear.equals(year))
            {
                break;
            }
            
            // Click previous button to move to past month
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }
        
        // Select the date
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
        
        for(WebElement dt : alldates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException 
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        
        // Using date pickers
        String year = "2024";
        String month = "April";
        String date = "22";
         
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        selectpastdates(driver, month, year, date);
        Thread.sleep(2000);
        
        driver.quit();
    }
}
