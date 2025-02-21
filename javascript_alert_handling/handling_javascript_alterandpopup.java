package javascript_alert_handling;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_javascript_alterandpopup {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//to click on click for Js Alert
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		
		Alert alert=driver.switchTo().alert();	
		
		System.out.println(alert.getText());
			
		alert.accept();
		
driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		
		Alert alert1=driver.switchTo().alert();	
		
		System.out.println(alert1.getText());
			
		alert1.accept();
		System.out.println("OK button clicked");
		
driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		
		Alert alert2=driver.switchTo().alert();	
		
		System.out.println(alert2.getText());
			
		alert2.accept();
		System.out.println("OK button clicked");
		
	}

}
