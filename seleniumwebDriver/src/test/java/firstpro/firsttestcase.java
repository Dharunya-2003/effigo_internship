package firstpro;

import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String set_title=driver.getTitle();
        if(set_title.equals("Your Store"))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fails");
        }
        driver.close();
	}
}
