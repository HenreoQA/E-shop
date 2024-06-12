package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.EditAccountPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import testbases.BaseClass;

public class TC_MyAccount_AccountDetails_07 extends BaseClass
{
	@Test
	  public void verify_password_change()
	  {
			logger.info("**** Starting TC_MyAccount_AccountDetails_07  *****");
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
			 
			 logger.info("Clicking on account details..");
			 
			 mp.clickaccountdetails();
			 
			 logger.info("Changing password...");
			 
			 EditAccountPage EP= new EditAccountPage(driver);
			 
			 EP.currentpassword(p.getProperty("password"));
			 EP.newpassword("Munachimso2016@");
			 EP.confirmpassword("Munachimso2016@");
			 EP.save();
			 
			 
			 logger.info("Validating that password is changed...");
			 
			 String account_password = EP.passwordconfirmation();
			 
			 if(account_password.equals("Account details changed successfully."))
			 {
				 logger.info("Test passed...");
				 Assert.assertTrue(true);;
			 }
			 else
			 {
				 logger.info("Test failed...");
				 Assert.fail();
			 }

		  }
			catch(Exception e)
			{
				logger.error("test failure..");
			}
				
			       logger.debug("Application debug logs ends...");
					logger.info("**** Finished TC_MyAccount_AccountDetails_07  ****");
				  
			}

			 

}
