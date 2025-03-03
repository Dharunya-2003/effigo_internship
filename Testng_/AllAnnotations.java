package Testng_;

import org.testng.annotations.*;

public class AllAnnotations 
{	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before  suite.....");
	}
	
	@AfterSuite
	void  as()
	{
		System.out.println("this is after  suite.....");
	}
	
	
	@BeforeTest
	void bt()
	{
		System.out.println("this is before  test method.....");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("this is after  test method.....");
	}
	
	
	@BeforeClass
	void bc()
	{
		System.out.println("this is before class  method.....");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("this is after class  method.....");
	}
	
	
	@BeforeMethod
	void bm()
	{
		System.out.println("this is after class  method.....");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("this is after class  method.....");
	}
	
	
	@Test(priority=1)
	void tm1()
	{
		System.out.println("this is test method1.....");
	}
	
	@Test(priority=2)
	void tm2()
	{
		System.out.println("this is test method2.....");
	}

}
