package date24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkingvisibility {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isDisplayed():it is applicable for all the elements
		
		
		boolean b1=driver.findElement(By.id("small-searchterms")).isDisplayed();
		System.out.println(b1); //true
		
		//isEnabled() 
		
		boolean b2=driver.findElement(By.xpath("//button[@id='register-button']")).isEnabled();
		System.out.println(b2);  //true
		
		
		//isSelected()
		
		boolean b3=driver.findElement(By.id("gender-male")).isSelected();
		System.out.println(b3); //false		
		driver.findElement(By.id("gender-male")).click();		
		boolean b4=driver.findElement(By.id("gender-male")).isSelected();
		System.out.println(b4); //true	
		driver.findElement(By.id("gender-female")).click();	
		boolean b5=driver.findElement(By.id("gender-male")).isSelected();
		System.out.println(b5); //false
		
		boolean b6=driver.findElement(By.id("gender-female")).isSelected();
		System.out.println(b6); //true
		
			
		driver.findElement(By.id("gender-male")).click();
		boolean b7=driver.findElement(By.id("gender-female")).isSelected();
		System.out.println(b7); //false
		
		boolean b8=driver.findElement(By.id("gender-male")).isSelected();
		System.out.println(b8); //true
		
	
	}

}
