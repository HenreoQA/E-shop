package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	
	 WebDriver driver;
		
		public AccountRegistrationPage(WebDriver driver) 
		{
			super (driver);
	    }
		
		// capture WebElement without using page factory approach
		
		@FindBy(xpath="//input[@id='reg_email']") WebElement email_loc;
		
		@FindBy(xpath="//input[@id='reg_password']") WebElement password_loc;
		
		@FindBy(xpath="//input[@name='register']") WebElement reg_btn;
		
		@FindBy(xpath="//div[@id='body']//li[1]") WebElement warningmsg;
		
	
		// capture the action methods
		  
		  public void setemail(String Email)
		  {
			  email_loc.sendKeys(Email);
		  }
		  
		  public void setpassword(String Pwd)
		  {
			  password_loc.sendKeys(Pwd);
		  }
		  
		  public void clickregbtn()
		  {
			  reg_btn.click();
		  }
		  
		  
		  public String setwarningmsg() 
		  {
		  	return warningmsg.getText();
		  } 
		  
		
						 
}
