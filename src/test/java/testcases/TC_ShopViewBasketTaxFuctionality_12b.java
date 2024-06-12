package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.ShopPage;
import pageobjects.ViewBasketPage;
import testbases.BaseClass;

public class TC_ShopViewBasketTaxFuctionality_12b extends BaseClass
{
	@Test
	public void verify_tax_rate_for_india() throws InterruptedException 
	{
		logger.info("**** Starting TC_ShopViewBasketTaxFuctionality_12b  *****");
		logger.debug("capturing application debug logs....");
	  
		try
		{
		 HomePage hp=new HomePage(driver); // creating object for homepage
		hp.clickshop(); // call the method from homepage object class
		logger.info("Clicked on shop link");
		 
		// Thread.sleep(5000);
		
		 ShopPage sp=new ShopPage(driver);
	     
	     logger.info("Clicking on add to basket button...");
	     
	     sp.ClickAddtobasket();
	     
	     logger.info("Viewing book in the menu item with price...");
	     
	    boolean menu_item = sp.menuitemdisplay();
	    
	    if(menu_item==true)
	    {
	    	 logger.info("pass");
	    	 Assert.assertTrue(true);
	    }
	    else
		   {
			   logger.error("fail");
			   Assert.fail();
		   }
	    
	    logger.info("Clicking on item link...");
	    
	    sp.clickitemlink();
	    
	    logger.info("Checking if total < subtotal");
	    
	    ViewBasketPage vb=new ViewBasketPage(driver);
	    
	    String total = vb.Totalvalue();
	    String subtotal = vb.Subtotalvalue();
	    
	 // Remove the currency symbol and convert the string values to double
	 			double totals = Double.parseDouble(total.replace("₹", ""));
	 			double subtotals = Double.parseDouble(subtotal.replace("₹", ""));
	 			
	 		      if(totals<subtotals)
	 			  {
	 				  logger.info("Passed");
	 				  Assert.assertTrue(true);
	 			  }
	 			  else
	 			  {
	 				  logger.error("Failed");
	 				  Assert.fail();
	 			  }
	 		    
		   
	     logger.info("Clicking on checkout button...");
	     
	     vb.clickcheckout();
			   
         logger.info("Fill the billing details form...");
			  
         CheckoutPage CP = new CheckoutPage(driver);
			  
         Actions act = new Actions(driver); //Action class object
				
			  CP.billingFname("Tom");
			  CP.billingLname("Jerry");
			  CP.billingCompany("MacJoe");
			  CP.billingEmail("xdf12@gmail.com");
			  CP.billingPhone("012345678901");
			  CP.billingAddress("27 street");
		      CP.billingCity("West Brom");
		      CP.clickstatedropdown();
		      CP.stateSearch("Delhi");
		      act.sendKeys(Keys.ENTER).perform();
		      CP.billingPostcode("B54 7XT");
		      
		      logger.info("Checking tax amount for India...");
		      
		   // Input the price before tax
		        double pricebeforetax = 250.00;

		   // Calculate the tax amount based on a 2% tax rate
		        double taxrate = 0.02;
		        double expected_taxAmount = pricebeforetax * taxrate;

		         String india_taxAmount = CP.Indiataxrate();
		         
		     // converting from String to double and removing the currency symbol
		      
		      double actual_taxAmount = Double.parseDouble(india_taxAmount.replace("₹", ""));
		      
		     // Assert.assertEquals(actual_taxAmount, expected_taxAmount, "Tax rate calculation is incorrect");
		      
		      if(actual_taxAmount == expected_taxAmount)
 			  {
 				  logger.info("Tax rate calculation is correct");
 				  Assert.assertTrue(true);
 			  }
 			  else
 			  {
 				  logger.error("Tax rate calculation is incorrect");
 				  Assert.fail();
 			  }
 		    
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_ShopViewBasketTaxFuctionality_12b  ****");
			  
		}

}
