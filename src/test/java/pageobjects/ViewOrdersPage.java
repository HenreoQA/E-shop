package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewOrdersPage extends BasePage
{
WebDriver driver;
	
	public ViewOrdersPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//div[@class='woocommerce-MyAccount-content']") WebElement view_orders;
	
	@FindBy(xpath="//div[@id='body']//p[1]") WebElement order_number;
	
	
	
	// capture the action methods
	
	public boolean vieworderdetails()
	{
		try
		{
		return view_orders.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public boolean ordernumber()
	{
		try
		{
		return order_number.isDisplayed();
		}
		catch(Exception e)
		{
			return(false);
		}
	}


}
