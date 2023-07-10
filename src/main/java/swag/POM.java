package swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	
	public static WebDriver driver;
	
	public POM(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@type='text']")
    public static WebElement username;
    
    @FindBy(id="password")
	public static WebElement password;
	    	
	@FindBy(id="login-button")
    public static WebElement login;
		    
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public static WebElement Addtocart1;
	
	@FindBy(xpath="//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']")
	public static WebElement Addtocart2;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	public static WebElement Addtocart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
    public static WebElement ashopping_cart_link;
		    
	@FindBy(xpath="//button[@name='remove-sauce-labs-backpack']")
	public static WebElement remove;
	
	@FindBy(id="remove-test.allthethings()-t-shirt-(red)")
	public static WebElement remove1;
	
	@FindBy(id="checkout")
	public static WebElement checkout;
	
	@FindBy(id="first-name")
    public static WebElement Firstname;
     
    @FindBy(id="last-name")
    public static WebElement Lastname;
    
    @FindBy(id="postal-code")
    public static WebElement postalcode;
    
    @FindBy(id="continue")
    public static WebElement Continue;
    
    @FindBy(id="finish")
    public static WebElement finish;
    
   

}
