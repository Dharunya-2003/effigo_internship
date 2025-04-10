package RFQ_Creation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class again_upeg_login 
{
	WebDriver driver;  

    @BeforeClass
    public void setUp() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://training1.effigo.in/upeg/");
        
       
    }
    @Test
    public void login() throws InterruptedException {
        // Login Process
        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Mahi");
        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Bob@1234");
        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Sourcing']//span//img")).click();
        driver.findElement(By.xpath("(//div)[58]")).click();
        // click on view the RFQ
        
        String targetTitle = "Procurement of IT Equipment02"; // Change this to your desired title

     // Locate the row where the title matches
     WebElement row = driver.findElement(By.xpath("//tbody/tr[td[normalize-space()='" + targetTitle + "']]"));

     // Click the "View" button in that row (assuming it's the last column)
     WebElement viewButton = row.findElement(By.xpath("./td[last()]/a[contains(text(),'View')]"));

     new WebDriverWait(driver, Duration.ofSeconds(10))
         .until(ExpectedConditions.elementToBeClickable(viewButton))
         .click();

        
       /// driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]")).click();
        // click on raise addendum
        driver.findElement(By.xpath("//button[normalize-space()='Raise Addendum']")).click();
        // select by dates
        driver.findElement(By.xpath("//label[normalize-space()='Edit Dates']")).click();
        // to proceed 
        driver.findElement(By.xpath("//button[@id='Proceed']")).click();
        // to alter the date
        driver.findElement(By.xpath("//input[@id='endBidSubmissionDate']")).sendKeys("10-04-2025 14:45:00");
        // comment 
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("To stop");
        // click on raise app
        driver.findElement(By.xpath("//button[normalize-space()='Raise Addendum']")).click();
        // To close
        driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
        // to click on home
        driver.findElement(By.xpath("//span[@class='fa fa-home']")).click();
        // to approve
        driver.findElement(By.xpath("//body/section[@class='content-area']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='col-md-12 clrboth']/div[@class='white-block-container']/div[@class='dashboard-block-container']/div[@class='row']/div[@class='col-md-12 col-sm-12']/div[@class='pqs-container clearfix']/div[@class='pqs-div clearfix']/div[@class='pqs-box clearfix']/div[3]/div[1]/div[2]/div[1]")).click();
        // to view
        driver.findElement(By.xpath("//a[normalize-space()='View']")).click();
        // change the date
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='endBidSubmissionDate']")).sendKeys("10-04-2025 14:30:57");
        //comment
        driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("ok");
        // to accept and publish
        driver.findElement(By.xpath("//button[normalize-space()='Accept and Publish']")).click();
        // to click on home
       driver.findElement(By.xpath("//span[@class='fa fa-home']")).click();
       // live RFQ
       driver.findElement(By.xpath("//body/section[@class='content-area']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='col-md-12 clrboth']/div[@class='white-block-container']/div[@class='dashboard-block-container']/div[@class='row']/div[@class='col-md-12 col-sm-12']/div[@class='pqs-container clearfix']/div[@class='pqs-div clearfix']/div[@class='pqs-box clearfix']/div[1]/div[1]/div[3]/div[1]")).click();
        //to click on view
       driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]")).click();
     // Assuming 'driver' is already initialized
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000)); // Adjust timeout as needed

     // Wait until "Start Commercial" button is clickable
     WebElement startCommercialButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Start Commercial']")));

     // Click the button
     startCommercialButton.click();
     // to accept the alert
     Alert alert1 = driver.switchTo().alert();
     alert1.accept();
     
     // to accept after alert
     
     driver.findElement(By.xpath("//a[@class='blue-link']//span[@class='fa fa-thumbs-up']")).click();
     // to add the comment
     driver.findElement(By.xpath("//textarea[@id='priceAcceptComments']")).sendKeys("ok");
     // to accept the proceed
      driver.findElement(By.xpath("//button[@id='priceAcceptBtn']")).click();
   // to accept the alert
      Alert alert2 = driver.switchTo().alert();
      alert2.accept();
      //round price comparison
      driver.findElement(By.xpath("//button[normalize-space()='Rounds Price Comparison']")).click();
      //to close 
      driver.findElement(By.xpath("//button[@id='closeBtn']")).click();
      
      // price comparison
      driver.findElement(By.xpath("//button[normalize-space()='Price Comparison']")).click();
      // to close
      driver.findElement(By.xpath("//button[@id='closeBtn']")).click();
      // to stop commerical
      driver.findElement(By.xpath("//a[normalize-space()='Stop Commercial']")).click();
      Alert alert3 = driver.switchTo().alert();
      alert3.accept();
      
     
        
        

}
}
