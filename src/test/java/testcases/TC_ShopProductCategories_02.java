package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_ShopProductCategories_02 extends BaseClass
{
	@Test
	public void verify_product_categories_functionality() throws InterruptedException 
	{
		logger.info("**** Starting TC_ShopProductCategories_02  *****");
		logger.debug("capturing application debug logs....");
	  
		try
		{
		 HomePage hp=new HomePage(driver); // creating object for homepage
		hp.clickshop(); // call the method from homepage object class
		logger.info("Clicked on shop link");
		
		//Thread.sleep(5000);
		
		logger.info("Clicking on product links...");
		
		 ShopPage sp=new ShopPage(driver);
		 
		 sp.clickandroid();
		 
		// driver.navigate().back();
		 sp.clickhtml();
		 //driver.navigate().back();
		 sp.clickjavascript();
		 //driver.navigate().back();
		 sp.clickselenium();
	
		 logger.info("Validating the product...");
		 
		 boolean products = sp.productheadingsdisplay();
		 
		 if(products==true)
		 {
			 logger.info("pass");
			 Assert.assertTrue(true);
		 }
		 
		 else
		 {
			 logger.error("fail");
			 Assert.fail();
		 }
		 
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_ShopProductCategories_02  ****");
			  
		}

		 
	
}
