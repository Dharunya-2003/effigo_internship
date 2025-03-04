package Testng_mar4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency_methods 
{
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4, dependsOnMethods= {"openapp","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}

}
