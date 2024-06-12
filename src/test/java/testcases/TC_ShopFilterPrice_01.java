package testcases;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ShopPage;
import testbases.BaseClass;

public class TC_ShopFilterPrice_01 extends BaseClass
{
	@Test
	public void verify_price_filter_functionality() throws InterruptedException 
	{
		logger.info("**** Starting TC_ShopFilterPrice_01  *****");
		logger.debug("capturing application debug logs....");
	  
		try
		{
		 HomePage hp=new HomePage(driver); // creating object for homepage
		hp.clickshop(); // call the method from homepage object class
		logger.info("Clicked on shop link");
		
		//Thread.sleep(5000);
		
		logger.info("Adjusting the filter between 150-450rps price...");
		
		 ShopPage sp=new ShopPage(driver);
		 
		 // for minimum price
		 
		WebElement minimum = sp.minprice();
		Point min_location = minimum.getLocation();
		
		System.out.println(min_location);
		
		 Actions move= new Actions(driver); //Actions class object
		 
		 move.dragAndDropBy((WebElement) minimum, 0, 290).perform();
		 
		 // for maximum price
		 
		 WebElement maximum = sp.maxprice();
		 Point max_location = maximum.getLocation();
		
		 System.out.println(max_location);
		 
		 move.dragAndDropBy((WebElement) maximum, -28, 290).perform();
		 
		 logger.info("Clicking on filter button...");
		
		  sp.clickfilter();
	   
		}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_ShopFilterPrice_01  ****");
			  
		}

}
