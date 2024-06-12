package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage
{
WebDriver driver;
	
	public EditAccountPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//input[@id='password_current']") WebElement current_password;
	
	@FindBy(xpath="//input[@id='password_1']") WebElement new_password;
	
	@FindBy(xpath="//input[@id='password_2']") WebElement confirm_password;
	
	@FindBy(xpath="//input[@name='save_account_details']") WebElement save;
	
	@FindBy(xpath="//div[@class='woocommerce-message']") WebElement passwordconfirm_msg;
	
	
	// capture the action methods
	
	public void currentpassword(String pwd)
	{
		current_password.sendKeys(pwd);
	}
	
	
	public void newpassword(String pwd1)
	{
		new_password.sendKeys(pwd1);
	}
	
	public void confirmpassword(String pwd2)
	{
		confirm_password.sendKeys(pwd2);
	}
	
	public void save()
	{
		save.click();
	}

	public String passwordconfirmation()
	{
		return passwordconfirm_msg.getText();
	}
	

}
