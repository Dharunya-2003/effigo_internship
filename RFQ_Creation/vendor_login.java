package RFQ_Creation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class vendor_login 
{
	
		
		WebDriver driver;  

	    @BeforeClass
	    public void setUp() {
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://training1.effigo.in/portal/");
	        
	       
	    }
	    @Test
	    public void login() throws InterruptedException {
	        // Login Process
	        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Sam");
	        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Sam@1234");
	        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
	        Thread.sleep(1000);
	        
	        Alert alert2 = driver.switchTo().alert();
	        alert2.accept();
	        driver.findElement(By.xpath("//a[@href='getAllLiveTendersForSupplier']//div[@class='text-warning small'][normalize-space()='NEW']")).click();
	        driver.findElement(By.xpath("(//img)[5]")).click();
	        driver.findElement(By.xpath("(//label[@for='check0'])[1]")).click();
	        driver.findElement(By.xpath("(//label[@for='terms'])[1]")).click();
	        driver.findElement(By.xpath("//button[@id='payAndAccept']")).click();
	        driver.findElement(By.xpath("(//button[normalize-space()='Yes'])[1]")).click();
	        
	        // after accepting
	        driver.findElement(By.xpath("//button[normalize-space()='Proceed To Price Bid']")).click();
	        
	        driver.findElement(By.xpath("(//input[@loopindex=\"0\"])[1]")).sendKeys("2000");
	        driver.findElement(By.xpath("(//input[@loopindex=\"1\"])[1]")).sendKeys("2");
	        driver.findElement(By.xpath("(//input[@loopindex=\"0\"])[2]")).sendKeys("2000");
	        driver.findElement(By.xpath("(//input[@loopindex=\"1\"])[2]")).sendKeys("2");
	        driver.findElement(By.xpath("//textarea[@name=\"comments\"]")).sendKeys("ok");
	        driver.findElement(By.xpath("//button[@id='calc_total']")).click();
	      
	        driver.findElement(By.xpath("//button[@id='submit_123']")).click();
	    
	        driver.findElement(By.xpath("  //button[normalize-space()='Proceed To Final Bid']")).click();
	      
	        driver.findElement(By.xpath(" //input[@id='termsConditions']")).click();
	     
	        driver.findElement(By.xpath(" //form[@action='payment-detail-fee.html']//button[@type='button'][normalize-space()='Close']")).click();
	        driver.findElement(By.xpath(" //button[@id='cnfNSubmit']")).click();
	        driver.findElement(By.xpath("//button[@id='closeBtn']")).click();
	    }
	}

