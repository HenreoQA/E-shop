package testcases;

import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_ShopDefaultSorting_06 extends BaseClass
{
	@Test
	public void verify_sorting_by_lowtohigh_price() throws InterruptedException 
	{
		logger.info("**** Starting TC_ShopDefaultSorting_06  *****");
		logger.debug("capturing application debug logs....");
	  
		try
		{
		 HomePage hp=new HomePage(driver); // creating object for homepage
		hp.clickshop(); // call the method from homepage object class
		logger.info("Clicked on shop link");
		
		//Thread.sleep(5000);
		
		logger.info("Clicking on sort by low to high price in the dropdown...");
		
		 ShopPage sp=new ShopPage(driver);
		 
		 sp.sortingdrpdown();
		 sp.setsorting("price");
	
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_ShopDefaultSorting_06  ****");
			  
		}

		 

}
