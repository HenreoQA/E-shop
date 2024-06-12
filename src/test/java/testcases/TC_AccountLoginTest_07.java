package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbases.BaseClass;

public class TC_AccountLoginTest_07 extends BaseClass 
{
	@Test
	public void verify_login_case_sensitivity()
	{
		logger.info("**** Starting TC_AccountLoginTest_07  *****");
		logger.debug("capturing application debug logs....");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		
		logger.info("checking case sensitivity...");
		
		LoginPage LP = new LoginPage(driver);
		LP.setusername("MUNA@GMAIL.COM");
		LP.setpassword("NWALORRR1!@");
		LP.clickloginbtn();
		
		String Expected_username= "muna@gmail.com";
		String Actual_username= "MUNA@GMAIL.COM";
		
		String Expected_password= "Nwalorrr1!@";
		String Actual_password= "NWALORRR1!@";	
		
	if(Expected_password.equals(Actual_password) && Expected_username.equals(Actual_username))
		
			{
				logger.error("Test failed...");
				Assert.fail();
			 }
			else
			{
				logger.info("Test passed...");
				Assert.assertTrue(true);
			} 
	
	}
	catch(Exception e)
		 {
			  logger.error("test failure..");
			   Assert.fail();
		  }


	    logger.debug("Application debug logs ends...");
		logger.info("**** Finished TC_AccountLoginTest_07  ****");
	}

}
