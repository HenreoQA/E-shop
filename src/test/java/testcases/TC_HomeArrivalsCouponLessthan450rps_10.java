package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ProductPage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_HomeArrivalsCouponLessthan450rps_10 extends BaseClass
{
	@Test
	public void verify_coupon_not_applicable_to_book_price_lessthan_450rps() throws InterruptedException 
	{
		logger.info("**** Starting TC_HomeArrivalsCouponLessthan450rps_10  *****");
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
		   
				int actual_no_arrivals =arrivals;
			      
				  int expected_no_arrivals=3;
				   
				   if(actual_no_arrivals==expected_no_arrivals)
				   {
		              hp.clickthinking_HTML();
		   
		             logger.info("Test passed...");
				    Assert.assertTrue(true);
				   }
				   else
				   {
					   logger.error("Test failed");
					   Assert.fail();
				   }
				   
		   
		    logger.info("Clicking on add to basket button for book price less than 450rps...");
			  
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
		
			  logger.info("Entering coupon code and clicking on apply coupon...");
			  
			  pp.Couponcode("krishnasakinala");
			  pp.clickapplycoupon();
			  
		logger.info("Validating that coupon is not applicable for the book price that is less than 450rps..");
			String Errormsg = pp.couponerrormsg();  
			 
			  if(Errormsg.equals("The minimum spend for this coupon is ₹450.00."))
			  {
				  logger.info("Test Passed");
				  Assert.assertTrue(true);
			  }
			  else
			  {
				  logger.error("Test Failed");
				  Assert.fail();
			  }  
				
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_HomeArrivalsCouponLessthan450rps_10  ****");
			  
		}


}
