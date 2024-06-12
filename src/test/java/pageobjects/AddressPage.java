package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage
{
WebDriver driver;
	
	public AddressPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//h3[normalize-space()='Billing Address']") WebElement billing_address;
	
	@FindBy(xpath="//h3[normalize-space()='Shipping Address']") WebElement shipping_address;
	
	@FindBy(xpath="//a[@href='https://practice.automationtesting.in/my-account/edit-address/shipping']")
	WebElement edit_shippingaddres;
	
	// capture the action methods
	
		public boolean Billingaddress() 
		{
			try 
			{
				return (billing_address.isDisplayed());
			} 
			
			catch (Exception e) 
			{
				return (false);
			}
		}	
		
		public boolean Shippingaddress() 
		{
			try 
			{
				return (shipping_address.isDisplayed());
			} 
			
			catch (Exception e) 
			{
				return (false);
			}
		}
		
		public void clickeditshipping()
		{
			edit_shippingaddres.click();
		}


}
