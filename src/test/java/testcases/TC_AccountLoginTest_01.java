package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import testbases.BaseClass;

public class TC_AccountLoginTest_01 extends BaseClass
{
	@Test
	public void verify_account_login_with_credentials()
	{
		logger.info("**** Starting TC_AccountLoginTest_01  *****");
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
		 
         logger.info("Checking if login is successful..");
		 
		 MyAccountPage mp= new MyAccountPage(driver);
		 
		boolean Confirmmsg = mp.LoginconfirmmsgExist();
		
		 if(Confirmmsg==true)
		 {
			 logger.info("Login is successful");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Login is not successful");
			 Assert.fail();
		 }


		
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
			logger.info("**** Finished TC_AccountLoginTest_01  ****");
		  
		
	}

}
