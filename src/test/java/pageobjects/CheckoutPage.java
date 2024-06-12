package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage
{
  WebDriver driver;
	
	public CheckoutPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach
	
	@FindBy(xpath="//h3[@id='order_review_heading']") WebElement yourorder_heading;
	
	@FindBy(xpath="//a[normalize-space()='Click here to enter your code']") WebElement coupon;
	
	@FindBy(xpath="//input[@id='coupon_code']") WebElement coupon_code;
	
	@FindBy(xpath="//input[@name='apply_coupon']") WebElement apply_coupon;
	
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-35']/div[@class='page-content entry-content']/div[@class='woocommerce']/form[@name='checkout']/div[@id='order_review']/table[@class='shop_table woocommerce-checkout-review-order-table']/tfoot/tr[@class='cart-discount coupon-krishnasakinala']/td[1]/span[1]")
	WebElement coupon_amt;
	
	@FindBy(xpath="//ul[@class='woocommerce-error']//li[1]") WebElement couponerrormsg;
	
	@FindBy(xpath="//a[normalize-space()='×']") WebElement Remove_book;
	
	@FindBy(xpath="//p[@class='cart-empty']") WebElement emptycart_msg;
	
	@FindBy(xpath="//tr[@class='order-total']//span[@class='woocommerce-Price-amount amount']")
	WebElement Totalprice;
	
	@FindBy(xpath="//form[@class='checkout woocommerce-checkout']") WebElement view_details;
	
	@FindBy(xpath="//h3[normalize-space()='Billing Details']") WebElement billing_details;
	
	@FindBy(xpath="//h3[normalize-space()='Additional Information']") WebElement Additional_details;
	
	@FindBy(xpath="//input[@id='billing_first_name']") WebElement billing_firstname;
	
	@FindBy(xpath="//input[@id='billing_last_name']") WebElement billing_lastname;
	
	@FindBy(xpath="//input[@id='billing_company']") WebElement billing_company;
	
	@FindBy(xpath="//input[@id='billing_email']") WebElement billing_email;
	
	@FindBy(xpath="//input[@id='billing_phone']") WebElement billing_phone;
	
	@FindBy(xpath="//b[@role='presentation']") WebElement dropdown;
	
	@FindBy(xpath="//input[@id='s2id_autogen1_search']") WebElement Country_search;
	
	@FindBy(xpath="//input[@id='billing_address_1']") WebElement billing_address;
	
	@FindBy(xpath="//input[@id='billing_city']") WebElement billing_city;
	
	@FindBy(xpath="//input[@id='billing_state']") WebElement billing_state;
	
	@FindBy(xpath="//input[@id='billing_postcode']") WebElement billing_postcode;
	
	@FindBy(xpath="//input[@id='payment_method_bacs']") WebElement direct_bank;
	
	@FindBy(xpath="//input[@id='payment_method_cheque']") WebElement cheque;

	@FindBy(xpath="//input[@id='payment_method_cod']") WebElement cash;
	
	@FindBy(xpath="//input[@id='payment_method_ppec_paypal']") WebElement paypal;
	
	@FindBy(xpath="//input[@id='place_order']") WebElement place_order;
	
	@FindBy(xpath="//tr[@class='tax-rate tax-rate-roaming-tax-1']//span[@class='woocommerce-Price-amount amount']")
	WebElement Othercountry_taxrate;
	
	@FindBy(xpath="//tr[@class='tax-rate tax-rate-in-tax-1']//span[@class='woocommerce-Price-amount amount']")
	WebElement India_taxrate;
	
	@FindBy(xpath="//div[@id='s2id_billing_state']/a/span/b") WebElement state_dropdown;
	
	@FindBy(xpath="//input[@id='s2id_autogen2_search']") WebElement state_search;
	
	// capture the action methods
	
	public void clickentercoupon()
	{
		coupon.click();
	}
	
	public void setcoupon_code(String code)
	{
		coupon_code.sendKeys(code);
	}
	
	public void clickapplycoupon()
	{
		apply_coupon.click();
	}
	
	public String getcouponamt() // capture coupon amount
	{
		return coupon_amt.getText();
	}
	
	public String couponlessthan450rps() // capture coupon error message
	{
		return couponerrormsg.getText();
	}
	
	public void clickremove()
	{
		Remove_book.click();
	}
	
	public String emptycartmsg()
	{
		return emptycart_msg.getText();
	}
	
	public boolean totalpricedisplay()  //total price display status
	{
	
	try
	   {
		return Totalprice.isDisplayed();
	   }
	   
	   catch(Exception e)
	   {
		   return(false);
	   }
	}
	
	public boolean yourorderdisplay()  //your order display status
	{
	   try
	   {
		return yourorder_heading.isDisplayed();
	   }
	   
	   catch(Exception e)
	   {
		   return(false);
	   }
	}
	
	 public boolean viewdetailsdisplay()
	  	{
	  	
	  	try
	  	   {
	  		return view_details.isDisplayed();
	  	   }
	  	   
	  	   catch(Exception e)
	  	   {
	  		   return(false);
	  	   }
	  	}
 
	
	public boolean billingdetailsdisplay()  //billing details display status
	{
	   try
	   {
		return billing_details.isDisplayed();
	   }
	   
	   catch(Exception e)
	   {
		   return(false);
	   }
	}
	
	public boolean additionaldetailsdisplay()  //additional details display status
	{
	   try
	   {
		return Additional_details.isDisplayed();
	   }
	   
	   catch(Exception e)
	   {
		   return(false);
	   }
	}
	
	public void billingFname(String fname)
	{
		billing_firstname.sendKeys(fname);
	}
	
	public void billingLname(String lname)
	{
		billing_lastname.sendKeys(lname);
	}
	
	public void billingCompany(String company)
	{
		billing_company.sendKeys(company);
	}
	
	public void billingEmail(String email)
	{
		billing_email.sendKeys(email);
	}
	
	public void billingPhone(String phone)
	{
		billing_phone.sendKeys(phone);
	}
	
	public void clickdropdown()
	{
		dropdown.click();
	}
	
	public void countrySearch(String country)
	{
		Country_search.sendKeys(country);
	}
	
	public void billingAddress(String address)
	{
		billing_address.sendKeys(address);
	}
	
	public void billingCity(String city)
	{
		billing_city.sendKeys(city);
	}
	
	public void billingState(String state)
	{
		billing_state.sendKeys(state);
	}
	
	public void billingPostcode(String postcode)
	{
		billing_postcode.sendKeys(postcode);
	}
	
	public void clickdirectbank()
	{
		direct_bank.click();
	}
	
	public void clickcheque()
	{
		cheque.click();
	}
	
	public void clickcashondelivery()
	{
		cash.click();
	}
	
	public void clickpaypal()
	{
		paypal.click();
	}
	
	public void clickplaceorder()
	{
		place_order.click();
	}
	
	public String Othercountrytaxrate() // capture coupon error message
	{
		return Othercountry_taxrate.getText();
	}
	
	public String Indiataxrate() // capture coupon error message
	{
		return India_taxrate.getText();
	}
	
	public void clickstatedropdown()
	{
		state_dropdown.click();
	}
	
	public void stateSearch(String state)
	{
		state_search.sendKeys(state);
	}

	
}