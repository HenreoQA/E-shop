package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends BasePage
{
    WebDriver driver;
	
	public OrdersPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//a[normalize-space()='View']") WebElement view_btn;
	
	@FindBy(xpath="//div[@class='woocommerce-MyAccount-content']") WebElement orders;
	
	
	// capture the action methods
	
	public void clickview()
	{
		view_btn.click();
	}
	
	public boolean vieworders()
	{
		try
		{
		return orders.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}




}
