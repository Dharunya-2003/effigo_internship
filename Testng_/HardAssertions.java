package Testng_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
		@Test
		void test()
		{
			//Assert.assertEquals("dharunya","dharunya");
			//Assert.assertEquals(123,3654);
			
			//Assert.assertNotEquals(123, 123); // fail
			
			//Assert.assertNotEquals(258, 123); // pass
			
			//Assert.assertTrue(true); // pass
			//Assert.assertTrue(false); //fail
			
			//Assert.assertTrue(1==2); // fail
			//Assert.assertTrue(1===1); //  pass
			
			
			//Assert.assertFalse(1==2); // pass
			//Assert.assertFalse(1==1); // fail
			
			Assert.fail();
			
			
		}

	}


