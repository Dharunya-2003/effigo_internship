package feb25_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_dynamic_webtable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        // Login
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(3000);

        // Navigate to PIM > employee list
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        Thread.sleep(3000);

        // Dynamic webtable handling
        String before_xpath = "//div[@class='oxd-table-body']/div[";
        String after_xpath = "]/div/div[3]"; 

        for (int i = 1; i <=30; i++) 
        {  
            String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println(name);
            
            

            
            if (name.contains("Christopher"))
            {
            	driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div/div[1]/div")).click();
            }
           
        
        

        }
    }
    }

