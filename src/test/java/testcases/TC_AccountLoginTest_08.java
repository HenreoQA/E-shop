package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.LogoutPage;
import pageobjects.MyAccountPage;
import testbases.BaseClass;

public class TC_AccountLoginTest_08 extends BaseClass
{
	@Test
	public void verify_login_authentication()
	{
		logger.info("**** Starting TC_AccountLoginTest_08  *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		
		logger.info("Entering valid username and password ..");
	 	  
		LoginPage LP= new LoginPage(driver);
		LP.setusername(p.getProperty("username"));
		LP.setpassword(p.getProperty("password"));
		
		LP.clickloginbtn();
		 logger.info("clicked on login button..");
		 
		 
		 logger.info("clicking on signout button..");
			LogoutPage LO= new LogoutPage(driver);
			LO.clicksignoutbtn();
			
			logger.info("Navigating back..");
		
			driver.navigate().back();
			
			logger.info("checking if my login heading is displayed..");
			  
			 MyAccountPage macct = new MyAccountPage(driver);
			  
			  
			  boolean targetpage = macct.isloginheadingExist();
				
			//	Assert.assertEquals(targetpage, true,"Login failed");
			  
			  if(targetpage==true)
			  {
				  logger.info("Login test passed...");
				  Assert.assertTrue(true);
			  }
			  
			  else
			  {
				  logger.error("Login test failed...");
				  Assert.fail();
			  }
		
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
			logger.info("**** Finished TC_AccountLoginTest_08  ****");
		  
		
	}


}
