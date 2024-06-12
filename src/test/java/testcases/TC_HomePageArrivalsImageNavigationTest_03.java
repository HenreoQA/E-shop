package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ProductPage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_HomePageArrivalsImageNavigationTest_03 extends BaseClass
{
	@Test
	public void verify_homepage_arrivals_imagenavigation() throws InterruptedException 
	{
		logger.info("**** Starting TC_HomePageArrivalsImageNavigationTest_03  *****");
		logger.debug("capturing application debug logs....");
	  
		try
		{
		 HomePage hp=new HomePage(driver); // creating object for homepage
		hp.clickshop(); // call the method from homepage object class
		logger.info("Clicked on shop link");
		 
		//Thread.sleep(5000);
		
		 ShopPage sp=new ShopPage(driver);
	     sp.clickhome();
	     logger.info("Clicked on home link");
	     
	     logger.info("Checking total number of Arrivals images and navigation...");
	     
		int arrivals= hp.setarrivalsnumber();
		   
		   List<WebElement> images =hp.clickarrivalsimgs();
		   
		   for (WebElement image : images)
			  {  
				int actual_no_arrivals =arrivals;
			      
				  int expected_no_arrivals=3;
				   
				   if(actual_no_arrivals==expected_no_arrivals)
				   {
		             image.click();
		   
		             logger.info("Test passed...");
				    Assert.assertTrue(true);
				      break;
				   
				   }
				   else
				   {
					   logger.error("Test failed");
					   Assert.fail();
				   }
				   
			  }
		   
		   logger.info("checking if add to basket button is displayed..");
		  
		  ProductPage pp = new ProductPage(driver);
		  
		 boolean targetpage= pp.AddToBasketExist();
			
		//	Assert.assertEquals(targetpage, true,"Add to basket button not displayed");
		  
		  if(targetpage==true)
		  {
			  logger.info("Add to basket button displayed..");
			  Assert.assertTrue(true);
		  }
		  
		  else
		  {
			  logger.error("Add to basket button not displayed....");
			  Assert.fail();
		  }
		
		}
	catch(Exception e)
	{
		logger.error("test failure..");
	}
		
	       logger.debug("Application debug logs ends...");
			logger.info("**** Finished TC_HomePageArrivalsImageNavigationTest_03  ****");
		  
	}
	
}
