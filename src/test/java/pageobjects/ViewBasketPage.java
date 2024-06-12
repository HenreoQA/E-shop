package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewBasketPage extends BasePage
{
WebDriver driver;
	
	public ViewBasketPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']") 
	WebElement subtotal;
	
	@FindBy(xpath="//a[normalize-space()='Proceed to Checkout']") WebElement checkout_btn;
	
	@FindBy(xpath="//input[@title='Qty']")WebElement Qty;
	
	@FindBy(xpath="//input[@name='update_cart']") WebElement update_cart;
	
	@FindBy(xpath="//div[@class='woocommerce-message']") WebElement updateconfirmmsg;
	
	@FindBy(xpath="//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']")
	WebElement Total_value;
	
	@FindBy(xpath="//strong//span[@class='woocommerce-Price-amount amount']") WebElement Subtotal_value;
	
	
	// capture the action methods
	
	public String getsubtotalprice() //capture product price
	{
		return subtotal.getText();
	}
	
	public boolean ProceedToCheckout()
	{
	   try
	   {
		return checkout_btn.isDisplayed();
	   }
	   
	   catch(Exception e)
	   {
		   return(false);
	   }
     }
	
	
	public void clickcheckout()
	{
		checkout_btn.click();
	}
	
	public void clearqty()
	{
		Qty.clear();
		
	}
	
	public void setqty(String number)
	{
		Qty.sendKeys(number);
	}
	
	public void clickupdatecart()
	{
		update_cart.click();
	}
	
	public String getupdatemsg()  //capture cart update confirm message
	{
		return updateconfirmmsg.getText();
	}
	
	  public String Totalvalue() //capture total value
	  	{
	  		
	  		return Total_value.getText();
	  	}
	      
	      public String Subtotalvalue() //capture subtotal value
		  	{
		  		
		  		return Subtotal_value.getText();
		  	}
	      
	    		
/*	public boolean SubTotalValuesDisplay()  //subtotal values display status
	{
	   try
	   {
		return subtotal_values.isDisplayed();
	   }
	   
	   catch(Exception e)
	   {
		   return(false);
	   }
     }
	
	public boolean TotalValuesDisplay()  //total values display status
	{
	   try
	   {
		return total_values.isDisplayed();
	   }
	   
	   catch(Exception e)
	   {
		   return(false);
	   }

}*/


}
