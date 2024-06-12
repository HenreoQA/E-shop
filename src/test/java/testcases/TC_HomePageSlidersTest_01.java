package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_HomePageSlidersTest_01 extends BaseClass{
	
	@Test
	public void verify_homepage_with_three_sliders() throws InterruptedException 
	{
		logger.info("**** Starting TC_HomePageSlidersTest_01  *****");
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
	     
	     logger.info("Checking number of sliders...");
		 
	     int sliders =hp.setslidersnumber();
	     
	     int actual_no_sliders =sliders;
	      
		  int expected_no_sliders=3;
		   
		   if(actual_no_sliders==expected_no_sliders)
		   {
			   logger.info("Test passed...");
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   logger.error("Test failed");
			   Assert.fail();
		   }
	  }
	catch(Exception e)
	{
		logger.error("test failure..");
	}
		
	       logger.debug("Application debug logs ends...");
			logger.info("**** Finished TC_HomePageSlidersTest_01  ****");
		  
	}
	

}
