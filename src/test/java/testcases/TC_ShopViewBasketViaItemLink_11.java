package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.OrderDetailsPage;
import pageobjects.ShopPage;
import pageobjects.ViewBasketPage;
import testbases.BaseClass;

public class TC_ShopViewBasketViaItemLink_11 extends BaseClass
{
	@Test
	public void verify_viewbasket_through_item_link() throws InterruptedException 
	{
		logger.info("**** Starting TC_ShopViewBasketViaItemLink_11  *****");
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
		
	    logger.info("view Billing Details,Order Details,Additional details and Payment gateway details...");
	    
			  CheckoutPage CP = new CheckoutPage(driver);
			  
			  boolean details = CP.viewdetailsdisplay();
			  
			  if(details==true)
			  {
				  logger.info("Test Pass");
				  Assert.assertTrue(true);
			  }
			  else
			  {
				  logger.error("Test Fail");
				  Assert.fail();
			  }
			  
         logger.info("Fill the billing details form...");
			  
			  Actions act = new Actions(driver); //Action class object
				
			  CP.billingFname("Tom");
			  CP.billingLname("Jerry");
			  CP.billingCompany("MacJoe");
			  CP.billingEmail("xdf12@gmail.com");
			  CP.billingPhone("012345678901");
			  CP.clickdropdown();
			  CP.countrySearch("United Kingdom");
			  act.sendKeys(Keys.ENTER).perform(); //press keyboard enter key
			  CP.billingAddress("25 street");
		      CP.billingCity("West Bromwich");
		      CP.billingState("West Midlands");
		      CP.billingPostcode("B64 7WG");
		      
		      logger.info("Selecting payment method...");
		      
		    //CP.clickdirectbank();
		    //CP.clickcheque();
		    CP.clickcashondelivery();
		    //CP.clickpaypal();
		    
		    logger.info("Clicking on place order button...");
		    
		    CP.clickplaceorder();
		    
		    logger.info("Validating the confirmation message...");
		    
		    OrderDetailsPage od= new OrderDetailsPage(driver); //creating order details object
		    
		    String confirm = od.SetConfirmationmsg();
		    
		    if(confirm.equals("Thank you. Your order has been received."))
		    {
		    	logger.info("Order is placed successfully");
		    	Assert.assertTrue(true);
		    }
		    
		    else
		    {
		    	logger.info("Order not placed successfully");
		    	Assert.fail();
		    }	
				
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_ShopViewBasketViaItemLink_11  ****");
			  
		}

}
