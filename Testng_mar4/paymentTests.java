package Testng_mar4;

import org.testng.annotations.Test;

public class paymentTests 
{

	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymenttbyrupees()
	{
		System.out.println("payment by rupees......");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentbydollar()
	{
		System.out.println("payment by dollar......");
	}
	


}
