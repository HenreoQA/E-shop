package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ProductPage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_HomeArrivalCheckTotalPrice_13 extends BaseClass
{
	@Test
	public void verify_total_book_price() throws InterruptedException 
	{
		logger.info("**** Starting TC_HomeArrivalCheckTotalPrice_13  *****");
		logger.debug("capturing application debug logs....");
	  
		try
		{
		 HomePage hp=new HomePage(driver); // creating object for homepage
		hp.clickshop(); // call the method from homepage object class
		logger.info("Clicked on shop link");
		 
		//Thread.sleep(5000); //wait from Java
		
		/*synchronized(driver) // wait from selenium webdriver
		{
		driver.wait(3000);
		} */
		 
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
		   
		    logger.info("Clicking on add to basket button...");
			  
			  ProductPage pp = new ProductPage(driver);
			  
			  pp.clickaddtobasket();
			  
         logger.info("Viewing the book in the menu item with price...");
			  
			  boolean menu_item = pp.Menuitemwithprice();
			  
			  if(menu_item==true)
			  {
				  logger.info("Passed...");
				  Assert.assertTrue(true);
			  }
			  else
			  {
				  logger.info("Failed");
				  Assert.fail();
			  }
		
			  logger.info("Clicking on menu item link...");
			  
			  pp.clickmenuitem();
			  
			  logger.info("Validating total price of the book...");
			  
			 String actual_price = pp.totalprice();
		 
		       if(actual_price.equals("₹500.00"))
			  {
				  logger.info("Total price is ₹500.00");
				  Assert.assertTrue(true);
			  }
			  
			  else
			  {
				  logger.error("Total price is not ₹500.00");
				  Assert.fail();
			  }
			  
			 	  
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_HomeArrivalCheckTotalPrice_13  ****");
			  
		}

}
