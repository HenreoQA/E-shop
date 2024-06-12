package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testbases.BaseClass;

public class TC_AccountRegistrationTest_04 extends BaseClass
{
	@Test
	public void verify_account_reg_with_empty_password() 
	{
		  logger.info("**** starting TC_AccountRegistrationTest_04  *****");
		  logger.debug("capturing application debug logs....");
		  
		  try 
		{
		 HomePage hp=new HomePage(driver);
		 hp.clickMyAccount();
		   logger.info("Clicked on My Account link");
		 
		   logger.info("Entering Account Registration details.. ");
		 
	     AccountRegistrationPage Reg= new AccountRegistrationPage(driver);
	     Reg.setemail("fred@gmail.com");
	     Reg.setpassword("");
	     
	     Reg.clickregbtn();
	       logger.info("clicked on register button..");
	       
	  	String warningmsg=Reg.setwarningmsg();
	   	 
	       logger.info("Validating warning message..");
			
			if(warningmsg.equals("Error: Please enter an account password."))
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
		    logger.info("**** finished TC_AccountRegistrationTest_04  *****");
			
		
	
	}

	
	

}
