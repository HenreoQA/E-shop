package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import testbases.BaseClass;

public class TC_AccountLoginTest_06 extends BaseClass
{
	@Test
	public void verifymaskedpassword()
	{
		logger.info("**** Starting TC_AccountLoginTest_06  *****");
		logger.debug("capturing application debug logs....");
		
		try
	    {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		
		logger.info("checking masked password ..");
	 	      
		WebElement passwordField = driver.findElement(By.name("password"));
	
	    passwordField.sendKeys("Nwalorrr1@");

	        String enteredPassword = passwordField.getAttribute("value");
	        String expectedMaskedPassword = "Nwalorrr1@"; // Define the expected masked password
	        
	        if(enteredPassword.equals(expectedMaskedPassword))
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
			logger.info("**** Finished TC_AccountLoginTest_06  ****");
		  
		
	}

}
