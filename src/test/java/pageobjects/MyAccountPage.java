package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//h2[normalize-space()='Login']") WebElement loginheading;
	
	@FindBy(xpath="//a[normalize-space()='Dashboard']") WebElement dashboard_link;
	
	@FindBy(xpath="//p[contains(text(),'Hello')]") WebElement login_confirmationmsg;
	
	@FindBy(xpath="//a[normalize-space()='Orders']") WebElement orders_link;
	
	@FindBy(xpath="//a[normalize-space()='Addresses']") WebElement address_link;
	
	@FindBy(xpath="//div[@class='woocommerce-message']") WebElement shippingaddress_confirmationmsg;
	
	@FindBy(xpath="//a[normalize-space()='Account Details']") WebElement account_details;
	
	@FindBy(xpath="//h2[normalize-space()='Login']") WebElement logout_confirm;
	
	
	// capture the action methods
	
	public boolean isloginheadingExist() // login heading display status
	{
		try 
		{
			return (loginheading.isDisplayed());
		} 
		
		catch (Exception e) 
		{
			return (false);
		}
	}	

	public boolean isdashboardExist() // dashboard display status
	{
		try 
		{
			return (dashboard_link.isDisplayed());
		} 
		
		catch (Exception e) 
		{
			return (false);
		}
	}	
	
	public boolean LoginconfirmmsgExist()
	{
		try 
		{
			return (login_confirmationmsg.isDisplayed());
		} 
		
		catch (Exception e) 
		{
			return (false);
		}
	}	
	
	public void clickorders()
	{
		orders_link.click();
	}
	
	public void clickaddresses()
	{
		address_link.click();
	}
	
	public String addressconfirmationmsg()
	{
		return shippingaddress_confirmationmsg.getText();
	}
	
	public void clickaccountdetails()
	{
		account_details.click();
	}
	
	/* public void navigatebackbtn()
	 {
		 driver.navigate().back();
	 }*/
	 
	 public boolean confirmlogout()
	 {
		 try
		 {
		 return logout_confirm.isDisplayed();
		 }
		 catch(Exception e)
		 {
			 return(false);
		 }
	 }

	

	


}
