package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import pageobjects.OrdersPage;
import testbases.BaseClass;

public class TC_MyAccountOrders_02 extends BaseClass
{
	@Test
	  public void verify_orders()
	  {
			logger.info("**** Starting TC_MyAccountOrders_02  *****");
			logger.debug("capturing application debug logs....");
		  
			try
			{
			 HomePage hp=new HomePage(driver); 
			hp.clickMyAccount();
			logger.info("Clicked on my account menu");
			
			logger.info("Entering registered username and password ..");
			
			LoginPage LP= new LoginPage(driver);
			
			LP.setusername(p.getProperty("username"));
			LP.setpassword(p.getProperty("password"));
			
			LP.clickloginbtn();
			 logger.info("clicked on login button..");
			 
			 logger.info("Checking if login is successful..");
			 
			 MyAccountPage mp= new MyAccountPage(driver);
			 
			boolean Confirmmsg = mp.LoginconfirmmsgExist();
			
			 if(Confirmmsg==true)
			 {
				 logger.info("Login is successful");
				 Assert.assertTrue(true);;
			 }
			 else
			 {
				 logger.info("Login is not successful");
				 Assert.fail();
			 }


			 
			 logger.info("Clicking on my account link and orders link..");
			 
			 hp.clickMyAccount();
			 mp.clickorders();
			 
			 logger.info("Validating that user can view their orders...");
			 
			 OrdersPage op=new OrdersPage(driver);
	
			 boolean Orders = op.vieworders();
			 		 
			 if(Orders==true)
			 {
				 logger.info("user can view their orders...");
				 Assert.assertTrue(true);;
			 }
			 else
			 {
				 logger.info("user cannot view their orders");
				 Assert.fail();
			 }

		  }
			catch(Exception e)
			{
				logger.error("test failure..");
			}
				
			       logger.debug("Application debug logs ends...");
					logger.info("**** Finished TC_MyAccountOrders_02  ****");
				  
			}

}
