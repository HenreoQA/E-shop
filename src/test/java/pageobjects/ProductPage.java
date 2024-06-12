package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage
{
WebDriver driver;
	
	public ProductPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	

	@FindBy(xpath="//button[normalize-space()='Add to basket']") WebElement AddToBasket_btn;
	
	@FindBy(xpath="//a[normalize-space()='Description']") WebElement Description_tab;
	
	@FindBy(xpath="//h2[normalize-space()='Product Description']") WebElement Product_Description;
	
	@FindBy(xpath="//a[normalize-space()='Reviews (0)']") WebElement Review_tab;
	
	@FindBy(xpath="//h2[normalize-space()='Reviews']") WebElement Reviews;
	
	@FindBy(xpath="//a[normalize-space()='View Basket']") WebElement View_Basket;
	
	@FindBy(xpath="//a[@title='View your shopping cart']") WebElement menuitem_withprice;
	
    @FindBy(xpath="//input[@id='coupon_code']") WebElement coupon_code;
	
	@FindBy(xpath="//input[@name='apply_coupon']") WebElement apply_coupon;
	
	@FindBy(xpath="//td[@data-title='Coupon: krishnasakinala']//span[@class='woocommerce-Price-amount amount']")
	WebElement coupon_amt;
	
	@FindBy(xpath="//ul[@class='woocommerce-error']/li[1]") WebElement coupon_errormsg;
	
	@FindBy(xpath="//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']")
	WebElement Total_price;
	
	
	// capture the action methods
	
	public void clickaddtobasket()  //click on add to basket
	{
		AddToBasket_btn.click();
	}
	
	public boolean AddToBasketExist() // Add to basket button display status
	{
		try 
		{
			return (AddToBasket_btn.isDisplayed()); 
		} 
		
		catch (Exception e) 
		{
			return (false);
		}
	}	
	
	public void clickdescription() //clicking on description tab
	{
		Description_tab.click();
	}
	
	public boolean Product_Description() // Product Description display status
	{
		try 
		{
			return (Product_Description.isDisplayed()); 
		} 
		
		catch (Exception e) 
		{
			return (false);
		}
	}	
	
     public void clickreview()  //click on reviews
     {
    	 Review_tab.click();
     }
     
 	public boolean reviewsdisplay() // Product reviews display status
 	{
 		try 
 		{
 			return (Reviews.isDisplayed()); 
 		} 
 		
 		catch (Exception e) 
 		{
 			return (false);
 		}
 	}
 	
 	public void clickviewbasket() //click on view basket
 	{
 		View_Basket.click();
 	}
 	
 	public boolean Menuitemwithprice()
	{
		try 
		{
			return (menuitem_withprice.isDisplayed()); 
		} 
		
		catch (Exception e) 
		{
			return (false);
		}
	}
 	
 	public void clickmenuitem()
 	{
 		menuitem_withprice.click();
 	}
	
 	  public void Couponcode(String code)
	  	{
	  		coupon_code.sendKeys(code);
	  	}
	      
	      public void clickapplycoupon()
	      {
	    	  apply_coupon.click();
	      }
	      
	      public String Couponamount()
	      {
	    	  return coupon_amt.getText();
	      }
	      
	      public String couponerrormsg()
	      {
	    	  return coupon_errormsg.getText();
	      }
	      
	      public String totalprice()
	      {
	    	  return Total_price.getText();
	      }
	
	
	


}
