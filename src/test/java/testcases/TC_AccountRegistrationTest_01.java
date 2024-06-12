package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testbases.BaseClass;

public class TC_AccountRegistrationTest_01 extends BaseClass
{
	@Test
	public void verify_account_reg_with_valid_credentials() 
	{
		  logger.info("**** starting TC_AccountRegistrationTest_01  *****");
		  logger.debug("capturing application debug logs....");
		  
		  try 
		{
		 HomePage hp=new HomePage(driver);
		 hp.clickMyAccount();
		   logger.info("Clicked on My Account link");
		 
		   logger.info("Entering Valid Account Registration details.. ");
		 
	     AccountRegistrationPage Reg= new AccountRegistrationPage(driver);
	     Reg.setemail("muna@gmail.com");
	     Reg.setpassword("Nwalorrr1!@");
	     
	     Reg.clickregbtn();
	       logger.info("clicked on register button..");
		
		}
		 
		  catch(Exception e)
		  {
			  logger.error("test failure..");
			   Assert.fail();
		  }
			
		    logger.debug("Application debug logs ends...");
		    logger.info("**** finished TC_AccountRegistrationTest_01  *****");
			
	
	
	}

 
}	 

