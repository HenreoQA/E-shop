package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class ShopPage extends BasePage
{
	
	 WebDriver driver;
		
		public ShopPage(WebDriver driver) 
		{
		  super(driver);
		}
		
		// capture WebElement using page factory approach
		
		@FindBy(xpath="//a[normalize-space()='Home']") 
		WebElement home_loc;
		
		@FindBy(xpath="//span[1][@class='ui-slider-handle ui-corner-all ui-state-default']") 
		WebElement min_price;
		

		@FindBy(xpath="//span[2][@class='ui-slider-handle ui-corner-all ui-state-default']") 
		WebElement max_price;
		
		@FindBy(xpath="//button[normalize-space()='Filter']") WebElement filter;
		
		@FindBy(xpath="//a[normalize-space()='Android']") WebElement android_product;
		
		@FindBy(xpath="//a[normalize-space()='HTML']") WebElement html_product;
		
		@FindBy(xpath="//a[normalize-space()='JavaScript']") WebElement javascript_product;
		
		@FindBy(xpath="//a[normalize-space()='selenium']") WebElement selenium_product;
		
		@FindBy(xpath="//nav[@class='woocommerce-breadcrumb']") WebElement product_heading;
		
		@FindBy(xpath="//select[@name='orderby']") WebElement sorting_dropdown;
		
		@FindBy(xpath="//span[@class='onsale']") WebElement sales_product;
		
		@FindBy(xpath="//del//span[@class='woocommerce-Price-amount amount']") WebElement old_price;
		
		@FindBy(xpath="//ins//span[@class='woocommerce-Price-amount amount']") WebElement actual_price;
		
		@FindBy(xpath="//li[2]//a[2]") WebElement addtobasket_btn;
		
		@FindBy(xpath="//a[@title='View your shopping cart']") WebElement menu_item;
		
		@FindBy(xpath="//a[@title='View Basket']") WebElement viewbasket_link;
		
		@FindBy(xpath="//span[@class='cartcontents']") WebElement item_link;
		
		
	    // capture the action methods
	    
	      public void clickhome() 
	     {
	    	home_loc.click();
	  	 }
	      
	      public WebElement minprice()
		  {
	    	  return min_price;
		    		
		   }
	      
	      public WebElement maxprice() 
		     {
		    	return max_price;
		  	 }
	      
	      public void clickfilter() 
		     {
		    	filter.click();
		  	 }
	      
	      public void clickandroid() 
		     {
	    	  android_product.click();
		  	 }
	    
	      public void clickhtml() 
		     {
	    	  html_product.click();
		  	 }
	      
	      public void clickjavascript()
	      {
	    	  javascript_product.click();
	      }
	      
	      public void clickselenium()
	      {
	    	  selenium_product.click();
	      }
	      
	      
	      public boolean productheadingsdisplay()
	  	{
	  	
	  	try
	  	   {
	  		return product_heading.isDisplayed();
	  	   }
	  	   
	  	   catch(Exception e)
	  	   {
	  		   return(false);
	  	   }
	  	}
	      
	      public void sortingdrpdown()
	      {
	    	  sorting_dropdown.click();
	      }
	      
	      public void setsorting(String data)
	  	{
	  		Select drpobj=new Select(sorting_dropdown);
	  		drpobj.selectByValue(data);
	  	}
	  	
	      public void clicksalesproduct()
	      {
	    	  sales_product.click();
	      }
	      
	      public boolean isoldpriceExist() 
	  	{
	  		try 
	  		{
	  			return (old_price.isDisplayed());
	  		} 
	  		
	  		catch (Exception e) 
	  		{
	  			return (false);
	  		}
	  	}	
	      
	      public boolean isactualpriceExist()
	      {
	       
	    	  try	  
	       {
	    	  return actual_price.isDisplayed();
	       }
	    	  
	      catch (Exception e) 
		   {
		  	 return (false);
		   }
	      
	      }
	      
	      public void ClickAddtobasket()
	      {
	    	  addtobasket_btn.click();
	      }
	      
	      public boolean menuitemdisplay()
		  	{
		  	
		  	try
		  	   {
		  		return menu_item.isDisplayed();
		  	   }
		  	   
		  	   catch(Exception e)
		  	   {
		  		   return(false);
		  	   }
		  	}
	      
	      public void clickviewbasketlink() 
		     {
		    	viewbasket_link.click();
		  	 }
	      
	      public void clickitemlink()
	      {
	    	  item_link.click();
	      }
	     	     	   
}
	    
