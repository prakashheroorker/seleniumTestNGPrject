package testcases.suiteb;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login_Test {
	
	@Test
	public void doLogin() {
		String ActualResult="ABCa";
		String ExpectedResult="ABC";
		
    //   Assert.assertEquals(ActualResult, ExpectedResult);
		
	//	Assert.assertTrue(ActualResult=ExpectedResult,"False");
	//	Assert.assertTrue(1>2,"False");
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ActualResult, ExpectedResult, "Error Message PRH");
		softassert.assertEquals("ABC","ABC", "Error Message PRH");
		softassert.assertTrue(1>2,"False");
		
		softassert.assertAll();
	}

}
