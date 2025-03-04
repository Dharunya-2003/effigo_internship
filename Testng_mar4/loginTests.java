package Testng_mar4;

import org.testng.annotations.Test;

public class loginTests
{
	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("this is login by email......");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by facebook......");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("this is login by twitter......");
	}

}
