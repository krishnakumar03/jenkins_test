package co.testNg.programe;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftandHard_assert {
	
	@Test
	public void hardassertion()
	{
		System.out.println("this is my first cae has started");
		Assert.assertEquals("Priya", "Priya", "Actual ans expected result are not matching please raise a bug");
		System.out.println("this is my first cae has completed");
		
		Assert.assertTrue(true , "aSeert passed ");
		
		
	}
	
	@Test
	public void softassertion()
	{
		System.out.println("this is my second cae has started");
		SoftAssert softassertion = new SoftAssert();
		softassertion.assertEquals(12, 13);
		System.out.println("this is my second cae has completed");
	    softassertion.assertAll();
		
		
		
	}

}
