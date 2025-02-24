package date24;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class javascriptexecutor1___somestuff {

	public static void main(String[] args) throws IOException, InterruptedException {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Login using XPath locators
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        
        // Locate login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        // Highlight the element
        flash(loginBtn, driver);

        // Draw border around login button
        drawBorder(loginBtn, driver);

        // Take screenshot and store in file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot in desired location
        Files.copy(src, new File("C:\\Users\\dharu\\OneDrive\\Desktop\\screenshot.png1"));

        // Generate Alert
       // generateAlert(driver, "Testing Alert  Issue with login button!");

       // Thread.sleep(3000);
        // Click login button using JavaScript
        clickElementByJS(loginBtn, driver);

        // Refresh page using Selenium
        driver.navigate().refresh();

        // Refresh page using JavaScriptExecutor
      refreshBrowserByJS(driver);

       // Get page title using JavaScriptExecutor
        String title = getTitleByJS(driver);
        System.out.println("Page Title: " + title);
        
        Thread.sleep(3000);
        
        // get the page text
        System.out.println(getPageInnerText(driver));

        // Scroll to bottom of the page
        scrollPageDown(driver);
        
        WebElement OrangeHR = driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']")); 
        scrollIntoView(OrangeHR, driver);  
        drawBorder(OrangeHR, driver);
      
    }

    // Method to highlight the element
    public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {  // Reduced iteration for performance
            changeColor("rgb(0,200,0)", element, driver);
            changeColor(bgcolor, element, driver);
        }
    }

    // Method to change background color
    public static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
        try {
            Thread.sleep(50);  // Sleep to make effect visible
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Draws a red border around the element
    public static void drawBorder(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    // Generates an alert pop-up with a message
    public static void generateAlert(WebDriver driver, String message) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('" + message + "')");
    }
    
    

    // Clicks on login element using JavaScript
    public static void clickElementByJS(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }
    

    // Refreshes the browser using JavaScript
    public static void refreshBrowserByJS(WebDriver driver) {
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(0)");
    }

    // Gets the title of the page using JavaScript
   public static String getTitleByJS(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.title;").toString();
    }
   
   public static String getPageInnerText(WebDriver driver) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    String pageText = js.executeScript("return document.documentElement.innerText;").toString();
	    return pageText;
	}

    // Scrolls down to the bottom of the page
    public static void scrollPageDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));}

    // Scrolls to a specific element
   public static void scrollIntoView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
	}
}
	

	


