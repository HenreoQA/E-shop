package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	 WebDriver driver;
		
		public BasePage(WebDriver driver) // constructor to initiate the driver
		{
			this.driver=driver;
			PageFactory.initElements(driver, this); 
			
	    }

}
