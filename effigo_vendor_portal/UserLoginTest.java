package effigo_vendor_portal;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://training1.effigo.in/upeg/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dependsOnMethods = "effigo_vendor_portal.User_Creation.createUser",alwaysRun = false)
    public void testUserLoginAndChangePassword() {
        // Login
        driver.findElement(By.xpath("//input[@id='userNameId']")).sendKeys("Tomm");
        driver.findElement(By.xpath("//input[@id='passwordId']")).sendKeys("Tom@12344gmail.com");
        driver.findElement(By.xpath("//input[@id='sighInId']")).click();

        // Change Password
        driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("Tom@12344gmail.com");
        driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Tom@12345");
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Tom@12345");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
