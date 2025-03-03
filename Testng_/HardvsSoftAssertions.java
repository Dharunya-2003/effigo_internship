package Testng_;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions
{
	//@Test
	void test_hardasseration()
	{
		System.out.println("testing........");
		System.out.println("testing........");
		
		Assert.assertEquals(1,2); // hard assertion
		
		System.out.println("testing........");
		System.out.println("testing........");
		
		
	}
	
	@Test
	void test_softasseration()
	{
		System.out.println("testing........");
		System.out.println("testing........");
		
		
		SoftAssert sa=new 	SoftAssert();
		sa.assertEquals(1,2); // soft assertion
		
		System.out.println("testing........");
		System.out.println("testing........");
		
		sa.assertAll(); // mandatory
		
		
	}
	

}
