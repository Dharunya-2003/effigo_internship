package tasks;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DemoQATestNG {

    WebDriver driver;
    Actions actions;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

    @Test(priority = 1)
    public void testRightClick() {
        driver.get("https://demoqa.com/buttons");
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
        System.out.println(" Right-click operation completed.");
    }

    @Test(priority = 2)
    public void testFrameSwitching() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement frameHeading = driver.findElement(By.id("sampleHeading"));
        System.out.println(" Frame Text: " + frameHeading.getText());
        driver.switchTo().defaultContent();
    }

    @Test(priority = 3)
    public void testDropdown() {
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Yellow");
        System.out.println(" Dropdown selection done.");
    }

    @Test(priority = 4)
    public void testDynamicElement() {
        driver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for dynamic button to become enabled
        WebElement enableBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        System.out.println("Dynamic Button Enabled: " + enableBtn.isEnabled());
        
        
    }

    @Test(priority = 5)
    public void testMouseHover() {
        driver.get("https://demoqa.com/tool-tips");
        WebElement hoverBtn = driver.findElement(By.id("toolTipButton"));
        actions.moveToElement(hoverBtn).perform();
        System.out.println(" Mouse hover (tooltip) operation performed.");
    }
    
    @Test(priority = 6)
    public void testScrollOperation() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Dharuny SS");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("dharunya@gmail.com");
        
        driver.findElement(By.id("currentAddress")).sendKeys("bangalore");

        driver.findElement(By.id("permanentAddress")).sendKeys("bangalore");
        

        // Scroll to the submit button
        WebElement submitBtn = driver.findElement(By.id("submit"));
        

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();
       

        System.out.println("Scrolled to Submit button.");
    }


   // @AfterClass
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed.");
    }
}
