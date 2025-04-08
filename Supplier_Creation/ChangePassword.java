package Supplier_Creation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;

public class ChangePassword {
    WebDriver driver;
    WebDriverWait wait;

    // User credentials
    String adminUsername = "subadmin@bob.com";
    String adminPassword = "Bob@1234";
    String userName = "Dube";
    String newPassword = "dube@123gmail.com";
    String newpassword1="dube@1234gmail.com";
    
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://training1.effigo.in/admin/");
    }

    @Test
    public void changePasswordTest() {
        try {
            loginAdmin();
            updatePassword();
            openPortalAndLogin();
           
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    public void loginAdmin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys(adminUsername);
        driver.findElement(By.id("password")).sendKeys(adminPassword);
        driver.findElement(By.id("login")).click();
        System.out.println("Admin login successful.");
    }

    public void updatePassword() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[normalize-space()='Change User Password']"))).click();

        // Select User Type
        Select userType = new Select(driver.findElement(By.id("roleId")));
        userType.selectByVisibleText("Suppliers");

        // Search user
        driver.findElement(By.id("email")).sendKeys("Dube1");
        driver.findElement(By.id("search")).click();

        // Set new password
        driver.findElement(By.id("password_1")).sendKeys("aaa");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        
        Thread.sleep(1000);
       
    }

    public void openPortalAndLogin() {
        // Open portal in a new tab
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://training1.effigo.in/portal/', '_blank');");

        // Switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
       
        
        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("dube1@123gmail.com");
        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("aaa");
        driver.findElement(By.xpath("//input[@id='sighInId']")).click();

        // Change Password
        driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("aaa" );
        driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Dube@12345");
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Dube@12345");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.open('https://training1.effigo.in/portal/', '_blank');");

        // Switch to the new tab
        ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        
        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("dube1@123gmail.com");
        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Dube@12345");
        driver.findElement(By.xpath("//input[@id='sighInId']")).click();
        
        
    }

   
 
}
