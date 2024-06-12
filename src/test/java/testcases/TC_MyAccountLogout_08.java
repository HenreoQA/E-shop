package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.LogoutPage;
import pageobjects.MyAccountPage;
import testbases.BaseClass;

public class TC_MyAccountLogout_08 extends BaseClass
{
	@Test
	  public void verify_account_logout()
	  {
			logger.info("**** Starting TC_MyAccountLogout_08  *****");
			logger.debug("capturing application debug logs....");
		  
			try
			{
			 HomePage hp=new HomePage(driver); 
			hp.clickMyAccount();
			logger.info("Clicked on my account menu");
			
			logger.info("Entering registered username and password ..");
			
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


			 logger.info("Clicking on my account link..");
			 
			 hp.clickMyAccount();
			 
			 
			 logger.info("Clicking on logout button...");
			 
			 LogoutPage Log= new LogoutPage(driver);
			 
			 Log.clicklogoutbtn();
			 
			 logger.info("Validating that user has successfully logged out...");
			 
			 driver.navigate().back();
			 
			 boolean logout = mp.confirmlogout();
			 
			 if(logout==true)
			 {
				 logger.info("User has successfully logged out...");
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 logger.info("User has not logged out successfully...");
				 Assert.fail();
			 }
			 
			  }
			catch(Exception e)
			{
				logger.error("test failure..");
			}
				
			       logger.debug("Application debug logs ends...");
					logger.info("**** Finished TC_MyAccountLogout_08  ****");
				  
	}
	
}

			


