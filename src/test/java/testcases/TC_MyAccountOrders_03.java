package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import pageobjects.OrdersPage;
import pageobjects.ViewOrdersPage;
import testbases.BaseClass;

public class TC_MyAccountOrders_03 extends BaseClass
{
	@Test
	  public void verify_order_details()
	  {
			logger.info("**** Starting TC_MyAccountOrders_03  *****");
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
			 
			 logger.info("Clicking on view...");
			 
			 OrdersPage op=new OrdersPage(driver);
			 
			 op.clickview();
			 
			 logger.info("Validating that user can view their order, customer and billing details...");
			 
			 ViewOrdersPage vo= new ViewOrdersPage(driver);
			 
			 boolean ViewOrders = vo.vieworderdetails();
			 		 
			 if(ViewOrders==true)
			 {
				 logger.info("user can view order details");
				 Assert.assertTrue(true);;
			 }
			 else
			 {
				 logger.info("user cannot view order details");
				 Assert.fail();
			 }

		  }
			catch(Exception e)
			{
				logger.error("test failure..");
			}
				
			       logger.debug("Application debug logs ends...");
					logger.info("**** Finished TC_MyAccountOrders_03  ****");
				  
			}
}
