package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testbases.BaseClass;

public class TC_AccountRegistrationTest_02 extends BaseClass
{
	@Test
	public void verify_account_reg_with_invalid_email_id() 
	{
		  logger.info("**** starting TC_AccountRegistrationTest_02  *****");
		  logger.debug("capturing application debug logs....");
		  
		  try 
		{
		 HomePage hp=new HomePage(driver);
		 hp.clickMyAccount();
		   logger.info("Clicked on My Account link");
		 
		   logger.info("Entering Invalid Account Registration details.. ");
		 
	     AccountRegistrationPage Reg= new AccountRegistrationPage(driver);
	     Reg.setemail("munachi@gmail");
	     Reg.setpassword("Nwalorrr1!@");
	     
	     Reg.clickregbtn();
	       logger.info("clicked on register button..");
	       
	  	String warningmsg=Reg.setwarningmsg();
	   	
	       logger.info("Validating warning message..");
			
			if(warningmsg.equals("Error: Please provide a valid email address."))
			{
				logger.info("Test passed...");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Test failed...");
				Assert.fail();
			}
		
		
		}
		 
		  catch(Exception e)
		  {
			  logger.error("test failure..");
			   Assert.fail();
		  }
			
		    logger.debug("Application debug logs ends...");
		    logger.info("**** finished TC_AccountRegistrationTest_02  *****");
			
	
	
	}

	

}
