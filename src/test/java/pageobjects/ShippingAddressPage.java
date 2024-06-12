package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingAddressPage extends BasePage
{
WebDriver driver;
	
	public ShippingAddressPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	
	
	@FindBy(xpath="//input[@id='shipping_address_1']") WebElement shipping_address;
	
	@FindBy(xpath="//input[@id='shipping_city']") WebElement shipping_city;
	
	@FindBy(xpath="//input[@id='shipping_postcode']") WebElement shipping_postcode;
	
	@FindBy(xpath="//input[@name='save_address']") WebElement save_address;
	

	
	public void clearshippingAddress()
	{
		shipping_address.clear();
	}
	
	public void shippingAddress(String address)
	{
		shipping_address.sendKeys(address);
	}
	
	public void clearshippingCity()
	{
		shipping_city.clear();
	}
	
	public void shippingCity(String city)
	{
		shipping_city.sendKeys(city);
	}
	
	public void clearshippingPostcode()
	{
		shipping_postcode.clear();
	}
	
	public void shippingPostcode(String postcode)
	{
		shipping_postcode.sendKeys(postcode);
	}
	
	public void saveaddress()
	{
		save_address.click();
	}
	




}
