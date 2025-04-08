package Supplier_Creation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
    WebDriver driver;  

    @BeforeClass
    public void setUp() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://training1.effigo.in/admin/");
    }

    @Test
    public void loginTest() throws InterruptedException {
        // Login Process
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("subadmin@bob.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bob@1234");
        driver.findElement(By.id("login")).click();
        
        
        driver.findElement(By.xpath("//h3[normalize-space()='View All Supplier']")).click();
        
       driver.findElement(By.xpath("//button[@id='newSupplierRegistration']")).click();
       // filling the supplier details
       
       driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("Dube1");
       new Select(driver.findElement(By.xpath("//select[@id='companyRegisterCountry']"))).selectByVisibleText("India");
       driver.findElement(By.xpath("//input[@id='regiNumber']")).sendKeys("0077");
       new Select(driver.findElement(By.xpath("  //select[@id='country']"))).selectByVisibleText("India");
       driver.findElement(By.xpath("//textarea[@id='regiAddress']")).sendKeys("Bengaluru");
       driver.findElement(By.xpath("//input[@id='panNum']")).sendKeys("AQWER0935e");

   
       new Select(driver.findElement(By.xpath("  //select[@id='state']"))).selectByVisibleText("Karnataka");
       driver.findElement(By.xpath("//input[@id='cityId']")).sendKeys("Bengaluru");
       driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("400001");
       driver.findElement(By.xpath("//input[@id='gstNum']")).sendKeys("29ABCDE1234F1Z8");

       driver.findElement(By.xpath("//input[@id='companyEmail']")).sendKeys("Dube1@123gmail.com");
       driver.findElement(By.xpath("//input[@id='phoneNum']")).sendKeys("9874563210");
       
       driver.findElement(By.xpath("//button[@title='None selected']")).click();
       
       driver.findElement(By.xpath("//input[@value='PFASNP']")).click();
       
       driver.findElement(By.xpath("//input[@id='contactPerson']")).sendKeys("Dube1");
       driver.findElement(By.xpath("//input[@id='loginUser']")).sendKeys("dube1@123gmail.com");
       driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9874563210");
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dube1@123gmail.com");
       
       driver.findElement(By.xpath("//button[@id='next-to-admin']")).click();
       Alert alert = driver.switchTo().alert();  // Switch to alert
       alert.accept();  // Clicks "OK"
       
       

       
    }

    
}
