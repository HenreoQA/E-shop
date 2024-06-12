package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import testbases.BaseClass;

public class TC_MyAccountDashboard_01 extends BaseClass
{
	@Test
  public void verify_myaccount_dashboard()
  {
		logger.info("**** Starting TC_MyAccountDashboard_01  *****");
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

		 
		logger.info("Clicking on my account link and checking if dashboard is displayed..");
		 
		 hp.clickMyAccount();
		 
		 boolean Dashboard = mp.isdashboardExist();
		 
		 if(Dashboard==true)
		 {
			 logger.info("user can view dashboard");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("user cannot view dashboard");
			 Assert.fail();
		 }

	  }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
			
		       logger.debug("Application debug logs ends...");
				logger.info("**** Finished TC_MyAccountDashboard_01  ****");
			  
		}
	  
  }






