package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AddressPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import testbases.BaseClass;

public class TC_MyAccountAddress_05 extends BaseClass
{
	@Test
	  public void verify_billing_and_shipping_address()
	  {
			logger.info("**** Starting TC_MyAccountAddress_05  *****");
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
			 
			 logger.info("Clicking on address link..");
			 
			 mp.clickaddresses();
			 
	 logger.info("Validating that user can view billing and shipping address...");
			 
			 AddressPage AP= new  AddressPage(driver);
			 
			 boolean billing = AP.Billingaddress();
			 
			 boolean shipping = AP.Shippingaddress();
			 		 
			 if(billing||shipping==true)
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
					logger.info("**** Finished TC_MyAccountAddress_05  ****");
				  
			}
}
