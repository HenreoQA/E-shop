package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.HomePage;
import testbases.BaseClass;
import utilities.DataProviders;

public class TC_AccountLoginDDT extends BaseClass
{
	 @Test(dataProvider="Logindata", dataProviderClass=DataProviders.class) // excel data
    //@Test(dataProvider="dpp", dataProviderClass=DataProviders.class) // hard coding

	 //	public void verify_loginDDT(String username, String password)
	public void verify_loginDDT(String username, String password, String exp)
	{
		logger.info("**** Starting TC_LoginDDT *****");
		
		try {
	
		//Home page
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			
			logger.info("clicked MyAccount link...");
				
			//Login page
			
			logger.info("entering login details...");
			
			LoginPage LP=new LoginPage(driver);
			LP.setusername(username);
			LP.setpassword(password);
			LP.clickloginbtn(); //Login button
		
			logger.info("clicked login button...");
			
		}
		
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
			//logger.error("test failure..");
		}
			
		logger.info("**** Finished TC_LoginDDT *****");
	}

				
}
