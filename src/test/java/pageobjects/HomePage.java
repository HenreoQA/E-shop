package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage
{
      WebDriver driver;
	
	public HomePage(WebDriver driver) // creating constructor and pass the driver
	{
		 this.driver=driver;
	   	  
	}

	
	// capture WebElement without using page factory approach
	
	By Shop_loc = By.xpath("//a[normalize-space()='Shop']"); //locate shop
	
	By Myaccount_loc = By.xpath("//a[normalize-space()='My Account']"); //locate my account
	
	By sliders_no= By.xpath("//img[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']"); //number of sliders
	
	By Arrivalsimg_no = By.xpath("//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"); // number of Arrivals 

	By Thinking_HTML=By.xpath("//img[@title='Thinking in HTML']"); //locate thinking HTML image
	
         // capture the action methods
  
  public void clickshop()
  {
	  driver.findElement(Shop_loc).click();
  }
    
  public void clickMyAccount()
  {
	  driver.findElement(Myaccount_loc).click();
  }
  
  public int setslidersnumber()
  {
	  return driver.findElements(sliders_no).size();
  }
  
  public int setarrivalsnumber()
  {
	  return driver.findElements(Arrivalsimg_no).size();
  }
  
  public List<WebElement> clickarrivalsimgs() 
  {
	return driver.findElements(Arrivalsimg_no);
	
  }
  
  public void clickthinking_HTML()
  {
	  driver.findElement(Thinking_HTML).click();
  }
  
     
}
