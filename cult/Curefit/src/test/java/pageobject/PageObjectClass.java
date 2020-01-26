package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	
	public PageObjectClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[@class='non-clp-header']")
	public WebElement obj_eatfit;
	
	@FindBy(xpath = "//span[text()='Combos']")
	public WebElement obj_combos;
	
	@FindBy(xpath = "(//div[text()='ADD'])[44]")
	public WebElement obj_Wellness;
	
	@FindBy(xpath = "//img[@class='cart-image']")
	public WebElement obj_cart;
	
	@FindBy(xpath = "//div[@class = 'cart-wrapper']")
	public WebElement obj_cart_wrapper;
	
	
	@FindBy(xpath = "//div[@class = 'btn buy click']")
	public WebElement obj_Buy;
	
	@FindBy(className = "plus-sign")
	public WebElement obj_plus_sign;
	
	@FindBy(xpath = "(//div[@class='cart-checkout'])[1]")
	public WebElement obj_cart_checkout;
	
	@FindBy(xpath = "//button[@class='css-3uygy3 css-14t62iv']")
	public WebElement obj_sngoogle;
	
	@FindBy(xpath = "//button[text()='I agree']")
	public WebElement obj_agree;
	
//	@FindBy(xpath = "//div[@class='lCoei YZVTmd SmR8']")
//	public WebElement new_window;
	
	@FindBy(id ="identifierId")
	public WebElement obj_gmail;
	
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement obj_next;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement obj_pwd;
	
	
	
}
