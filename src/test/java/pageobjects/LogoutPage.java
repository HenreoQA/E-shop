package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage
{
	WebDriver driver;
	
	public LogoutPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//a[normalize-space()='Sign out']") WebElement signout_btn;
	
	@FindBy(xpath="//a[normalize-space()='Logout']") WebElement logout_btn;
	
	
	// capture the action methods
	
	 public void clicksignoutbtn()
	  {
		  signout_btn.click();
		 
	  }
	 
	 public void clicklogoutbtn()
	  {
		  logout_btn.click();
		 
	  }
	 
	
}
