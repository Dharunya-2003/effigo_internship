package effigo_vendor_portal;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class User_Creation {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        
        // Maximize window
        driver.manage().window().maximize();
        
        // Set implicit wait for all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open the admin portal
        driver.get("https://training1.effigo.in/admin/");
    }

    @Test
    public void createUser() throws InterruptedException {
        // Login Process
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("subadmin@bob.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bob@1234");
        driver.findElement(By.id("login")).click();
        Thread.sleep(1000);  // ❌ Try to replace with explicit wait if needed

        // Navigate to User Creation Page
        driver.findElement(By.xpath("//h3[normalize-space()='User Creation']")).click();
        driver.findElement(By.xpath("//a[@id='adduser']")).click();

        //  Fill User Creation Form
        Select businessUnit = new Select(driver.findElement(By.xpath("//select[@id='department']")));
        businessUnit.selectByVisibleText("Electronics");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Tomm");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tomm");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jerry");
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7896541230");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tom@12344gmail.com");

        // Select Designation
        Select designationDropdown = new Select(driver.findElement(By.xpath("//select[@id='designation']")));
        designationDropdown.selectByVisibleText("Manager");

        //  Select Location
        Select locationDropdown = new Select(driver.findElement(By.xpath("//select[@id='locationId']")));
        locationDropdown.selectByVisibleText("Kondapur");

        // Click Permission Checkboxes
        String[] checkboxes = {
            "//label[normalize-space()='Is Centralized User']",
            "//label[normalize-space()='Is Admin']",
            "//label[normalize-space()='Report']",
            "//label[normalize-space()='Category Approver']",
            "//label[normalize-space()='BU Head']"
        };
        for (String checkbox : checkboxes) {
            driver.findElement(By.xpath(checkbox)).click();
        }

        driver.findElement(By.xpath("//select[@id='categorysId']//option[@value='CAT-1'][normalize-space()='CAT-1']")).click();

        String[] checkboxes1 = {
            "//label[@for='catalogCreation']",
            "//label[@for='catalogApproval']",
            "//label[@for='requisitionCreation']",
            "//label[@for='poCreation']",
            "//label[@for='grnCreation']",
            "//label[normalize-space()='Reconciliation Approval']",
            "//label[normalize-space()='GRN View']",
            "//label[normalize-space()='Event-Create']",
            "//label[normalize-space()='Event-Edit']",
            "//label[normalize-space()='Event-Delete']",
            "//label[normalize-space()='Lot-Create']",
            "//label[normalize-space()='Lot-Edit']",
            "//label[normalize-space()='Lot-Delete']",
            "//label[@for='approval']",
            "//label[normalize-space()='Monitoring']",
            "//label[normalize-space()='Default Price Masking']",
            "//label[normalize-space()='Default Vendor Masking']",
            "//label[@for='tendercreator']",
            "//label[normalize-space()='Messaging']",
            "//label[normalize-space()='Technical evaluation']",
            "//label[normalize-space()='Commercial evaluation']",
            "//label[normalize-space()='Sourcing Approval']",
            "//label[normalize-space()='Observer']",
            "//label[normalize-space()='Central Procurement']",
            "//label[normalize-space()='Technical approval']",
            "//label[normalize-space()='Commercial approval']",
            "//label[normalize-space()='Lead Buyer']",
            "//label[normalize-space()='Questoinary Template']",
            "//label[normalize-space()='Logistics Spoc']"
        };

        //  Click All Checkboxes
        for (String checkbox1 : checkboxes1) {
            driver.findElement(By.xpath(checkbox1)).click();
        }
          
        
        driver.findElement(By.xpath("//button[@id='createClientUserBtn']")).click();
        //  Check for "User already exists" validation message
        try {
            WebElement errorMessage = driver.findElement(By.xpath("//div[@id='errorUserNameExists']"));
            if (errorMessage.isDisplayed()) {
                System.out.println("Validation Message: " + errorMessage.getText());
                
                //  Stop execution and fail the test
                Assert.fail("User already exists. Stopping test execution.");
                
                //  Stop full execution
                System.exit(1);
            }
        } catch (NoSuchElementException e) {
            System.out.println("User created successfully (No duplicate found).");
        }
    }

    
}
