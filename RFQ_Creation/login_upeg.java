package RFQ_Creation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_upeg 
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
        driver.findElement(By.xpath("//b[normalize-space()='CREATE RFQ']")).click();
        
        // basic information
        driver.findElement(By.xpath("//input[@id='tenderTitle']")).sendKeys("Procurement of IT Equipment");
    
        
        new Select(driver.findElement(By.xpath("//select[@id='tenderCurrency']"))).selectByVisibleText("INR");
       // new Select(driver.findElement(By.xpath("//select[@id='tenderCurrency']"))).selectByVisibleText("Limited/RFQ");
        
     
        new Select(driver.findElement(By.xpath("//select[@id='departmentId']"))).selectByVisibleText("Electronics");
      
         driver.findElement(By.xpath("//button[normalize-space()='Proceed to Add Work Item']")).click();
         
         // next
         
         driver.findElement(By.xpath("//label[normalize-space()='Only Commercial']")).click();
         driver.findElement(By.xpath("//input[@id='estimateValue']")).sendKeys("10000");
         driver.findElement(By.xpath("//tbody//tr//button[1]")).click();
         
         
      // Wait until the dropdown is visible
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement typeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='type']")));

         new Select(typeDropdown).selectByVisibleText("Services");
         
         driver.findElement(By.xpath("//input[@id='searchedString']")).sendKeys("%");
         
         driver.findElement(By.xpath("//button[@id='itemsSearch']")).click();
      // Select checkbox by item code
         WebElement checkbox = driver.findElement(By.xpath("//td[text()='PS1']/preceding-sibling::td/input[@type='checkbox']"));
         checkbox.click();
         WebElement checkbox1 = driver.findElement(By.xpath("//td[text()='HS1']/preceding-sibling::td/input[@type='checkbox']"));
         checkbox1.click();

        
         driver.findElement(By.xpath("//button[@class='pull-right btn btn-primary']")).click();
         driver.findElement(By.xpath("//button[@onclick='closeModal()']")).click();
         
         driver.findElement(By.xpath("//input[@id='subItemQuantity_1']")).sendKeys("5");
         driver.findElement(By.xpath("//textarea[@id='descriptions_1']")).sendKeys("description");
       
         driver.findElement(By.xpath("//input[@id='subItemQuantity_2']")).sendKeys("5");
         driver.findElement(By.xpath("//textarea[@id='descriptions_2']")).sendKeys("description");
         driver.findElement(By.xpath("//button[@onclick='goToFee();']")).click();
         
         driver.findElement(By.xpath("//a[@id='no']")).click();
         
      // Switch to alert and accept it
         Alert alert = driver.switchTo().alert();
         alert.accept();
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//tbody/tr/td/input[2]")).click();
         
         driver.findElement(By.xpath("//button[@id='price_template_save']")).click();
        // driver.findElement(By.xpath("//label[normalize-space()='Payment Terms']")).click();
         //new Select(driver.findElement(By.xpath("//label[normalize-space()='Payment Terms']"))).selectByVisibleText("Partial Advance Payment ");
        driver.findElement(By.xpath("//button[@id='savePriceLable']")).click();
        
        
        
        // suppliers
        driver.findElement(By.xpath("//button[normalize-space()='Search Suppliers']")).click();
        driver.findElement(By.xpath("//input[@id='searchString']")).sendKeys("Sam");
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
       
        
        driver.findElement(By.xpath("//a[@id='anchorTag_0']")).click();
        driver.findElement(By.xpath("//i[@class='fa fa-arrow-right']")).click();
         
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchString']"));
        searchBox.clear();  // Clears the existing text
        searchBox.sendKeys("Sonu");

        
      
       
        
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        driver.findElement(By.xpath("//a[@id='anchorTag_0']")).click();
        driver.findElement(By.xpath("//i[@class='fa fa-arrow-right']")).click();
        driver.findElement(By.xpath("//div[@id='vendorSearchModal']//button[@type='button'][normalize-space()='Close']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        driver.findElement(By.xpath("(//input[@value='Next'])[1]")).click();
        
        //Dates
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='submitCheckBox']")).click();
        driver.findElement(By.xpath("//input[@id='endBidSubmissionDate']")).click();
        driver.findElement(By.xpath("//input[@name=\"endBidSubmissionDate\"]")).sendKeys("09-04-2025 18:59:00");
        driver.findElement(By.xpath("//button[@onclick=\"goToSave();\"]")).click();
        
        
        //final submit
        driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("done");
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
        
        Thread.sleep(1000);
        

        
        

       
      
    
       
         
           
}
}