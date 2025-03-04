package Testng_mar4;

import org.testng.annotations.Test;

public class signupTests 
{
	@Test(priority=1,groups= {"regression"})
	void signupByEmail()
	{
		System.out.println("this is signup by email......");
	}

	@Test(priority=2,groups= {"regression"})
	void signupByfacebook()
	{
		System.out.println("this is signup by facebook......");
	}


	@Test(priority=3,groups= {"regression"})
	void signupBytwitter()
	{
		System.out.println("this is signup by twitter......");
	}


}
