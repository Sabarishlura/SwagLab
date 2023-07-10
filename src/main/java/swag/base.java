package swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class base {
	
	   public static WebDriver driver;
	   
	   public static WebDriver getbrowser(String browser) { 
			if(browser.equalsIgnoreCase("chrome")) {
				
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace1\\new_project\\chromedriver\\chromedriver.exe");
			 ChromeOptions option=new ChromeOptions(); 
			 option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}
			else if(browser.equalsIgnoreCase("edge")) {
				
				System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Cucumber_project\\edgedriver\\msedgedriver.exe");
				 driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("wedriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Cucumber_project\\firefoxdriver\\geckodriver.exe");
				 driver=new FirefoxDriver();
				
			}
			driver.manage().window().maximize();
			return driver;}
			
	
	    public static WebDriver geturl(String url) {
	    	driver.get(url);
	    	return driver;
	    	   }    
   public static void inputelement(WebElement username,String value) { 
   username.sendKeys(value);}

		    
		public static void inputelement1(WebElement password,String value) { 
		password.sendKeys(value);}
			    
		public static void clickonelement(WebElement login) {        
		login.click();}
		
		public static void clickoneelement(WebElement Addtocart) {
		Addtocart.click();}
		
		public static void clickoneelement1(WebElement Addtocart) {
		Addtocart.click();}
		
		public static void clickoneelement2(WebElement Addtocart) {
		Addtocart.click();}
			    
		public static void clickonelement3(WebElement ashopping_cart_link) {        
			ashopping_cart_link.click();}
		
		public static void clickoneelement4(WebElement remove) {
		remove.click();}
		
		public static void clickoneelement5(WebElement remove) {
		remove.click();}
		
		public static void clickonelement6(WebElement checkout) {
		checkout.click();}
	    
	    public static void inputelement2(WebElement Firstname,String value) { 
	    Firstname.sendKeys("Sabarish");}
	    
	    public static void inputelement3(WebElement Lastname,String value) { 
	    Lastname.sendKeys("B");}
	    
	    public static void inputelement4(WebElement postalcode,String value) { 
	    postalcode.sendKeys("600045");}
	    
	    public static void clickonelement7(WebElement Continue) {
	    Continue.click();
	    }
    
	    public static void clickonelement8(WebElement finish) {
	    finish.click();
		}
		
	    }	
		    

		
	

