package effigo_vendor_portal;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangePasswordTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://training1.effigo.in/admin/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dependsOnMethods = "effigo_vendor_portal.User_Creation.createUser", alwaysRun = false)
    public void testChangePassword() throws InterruptedException {
        // Login
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("subadmin@bob.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bob@1234");
        driver.findElement(By.id("login")).click();
        Thread.sleep(1000);

        // Navigate to "Change User Password"
        driver.findElement(By.xpath("//h3[normalize-space()='Change User Password']")).click();

        // Select User Type
        Select userType = new Select(driver.findElement(By.id("roleId")));
        userType.selectByVisibleText("Clients");

        // Enter Username & Search
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Tomm");
        driver.findElement(By.xpath("//input[@id='search']")).click();

        // Enter New Password & Submit
        driver.findElement(By.xpath("//input[@id='password_1']")).sendKeys("Tom@12344gmail.com");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

       
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
