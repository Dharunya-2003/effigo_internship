package date24;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_browserpopup_window {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");

        //to open a new window
        driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
        driver.findElement(By.xpath("//button[text()='click']")).click();

        // to store window handles
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();

        String parentWindowId = it.next();
        System.out.println("Parent Window ID: " + parentWindowId);

        String childWindowId = it.next();
        System.out.println("Child Window ID: " + childWindowId);

        // Switch to child window
        driver.switchTo().window(childWindowId);
        Thread.sleep(3000);

        System.out.println("Child window title: " + driver.getTitle());

        // Close child particular window
        driver.close();

        // Switch back to parent window
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent window title: " + driver.getTitle());

        // Close all browser windows(its stmg like to close all)
        driver.quit();
	}

}
