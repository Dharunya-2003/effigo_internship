package Testng_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asssertions 
{ 
	@Test
	void testtitle()
	{
		String exp_title="opencart";
		String act_title="openshot";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
		
		
		
	}
}
