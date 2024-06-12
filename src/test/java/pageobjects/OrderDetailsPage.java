package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends BasePage
{
WebDriver driver;
	
	public OrderDetailsPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	
	@FindBy(xpath="//p[@class='woocommerce-thankyou-order-received']") WebElement confirmationmsg;
	
	
	// capture the action methods
	
	   public String SetConfirmationmsg() 
	   {
	   	try {
	   		return (confirmationmsg.getText()); // capture the message
	   	    } 
	   	
	   	catch (Exception e) 
	   	{
	   		return (e.getMessage());

	   	}
	   	
	   }	


}
