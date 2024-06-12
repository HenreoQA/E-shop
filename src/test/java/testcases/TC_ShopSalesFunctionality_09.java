package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_ShopSalesFunctionality_09 extends BaseClass
{
	@Test
	public void verify_sales_product() throws InterruptedException 
	{
		logger.info("**** Starting TC_ShopSalesFunctionality_09  *****");
		logger.debug("capturing application debug logs....");
	  
		try
		{
		 HomePage hp=new HomePage(driver); // creating object for homepage
		hp.clickshop(); // call the method from homepage object class
		logger.info("Clicked on shop link");
		
		//Thread.sleep(5000);
		
		logger.info("Clicking on homepage...");
		
		 ShopPage sp=new ShopPage(driver);
		 
		 sp.clickhome();
		 
		 logger.info("Clicking on sales product...");
		 
		 sp.clicksalesproduct();
		 
		 logger.info("Validating old and actual prices...");
		 
		boolean old_price = sp.isoldpriceExist();
		boolean actual_price = sp.isactualpriceExist();
		
		if(old_price || actual_price ==true)
		{
		  logger.info("Test passed")	;
		  Assert.assertTrue(true);
		}
		
		else
		{
			logger.info("Test failed");
			Assert.fail();
		}
		
	  }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_ShopSalesFunctionality_09  ****");
			  
		}


}
