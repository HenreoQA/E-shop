package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	 WebDriver driver;
		
		public LoginPage(WebDriver driver) 
		{
			super (driver);
	    }
		
		// capture WebElement using page factory approach
		

		@FindBy(xpath="//input[@id='username']") WebElement username_loc;
		
		@FindBy(name="password") WebElement password_loc;
		
		@FindBy(xpath="//input[@name='login']") WebElement login_btn;
		
		
		// capture the action methods
		  
		  public void setusername(String Username)
		  {
			  username_loc.sendKeys(Username);
		  }
		  
		  
		  public void setpassword(String pwd)
		  {
			password_loc.sendKeys(pwd);
		  }
			 
		   public void clickloginbtn()
		  {
			  login_btn.click();
		  }
		   
	
		
	}
