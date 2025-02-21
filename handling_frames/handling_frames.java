package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().perform();

	}

}
