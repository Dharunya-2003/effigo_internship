package Testng_;

import org.testng.annotations.Test;

public class Testng_demo 
{
	@Test(priority=1)
	
	void openapp()
	{
		System.out.println("opining application");
		
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login application");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout of  application");
	}
}
