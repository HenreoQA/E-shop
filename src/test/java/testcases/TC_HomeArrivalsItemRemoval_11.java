package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.ProductPage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_HomeArrivalsItemRemoval_11 extends BaseClass
{
	@Test
	public void verify_removal_of_item_from_basket() throws InterruptedException 
	{
		logger.info("**** Starting TC_HomeArrivalsItemRemoval_11  *****");
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
		  
			  logger.info("Clicking on remove this item ...");
			  
			  CheckoutPage CP = new CheckoutPage(driver);
			  
			  CP.clickremove();
			  
			  logger.info("Validating empty cart message...");
			  
			  String EmptyCart=CP.emptycartmsg();
			  
			  String exp_msg=("Your basket is currently empty.");
			  
			  String actual_msg= EmptyCart;
			  
			  if(exp_msg.equals(actual_msg))
			  {
				  logger.info("Pass");
				  Assert.assertTrue(true);
			  }
			  else
			  {
				  logger.error("Fail");
				  Assert.fail();
			  }
				
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_HomeArrivalsItemRemoval_11  ****");
			  
		}

}
