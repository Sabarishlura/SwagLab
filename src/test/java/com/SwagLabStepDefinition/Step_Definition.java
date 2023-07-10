package com.SwagLabStepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.runner.swaglab_runnerclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swag.POM;
import swag.base;

public class Step_Definition extends base {
	
	public static WebDriver driver=swaglab_runnerclass.driver;
	
	public static POM value = new POM(driver);
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    driver.get("https://www.saucedemo.com/");
	}
	@When("the user enters {string} in the username field")
	public void the_user_enters_in_the_username_field(String string) {
		
		value.username.sendKeys("standard_user");
	    
	}
	@When("the user enters {string} in the password field")
	public void the_user_enters_in_the_password_field(String string) {
		
		value.password.sendKeys("secret_sauce");
	}
	@Then("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		
		value.login.click();
	}
	
	    @Given("the user adds a product to the cart")
	    public void the_user_adds_a_product_to_the_cart() {
	    	
	    	value.Addtocart.click();
	    	value.Addtocart1.click();
	    	value.Addtocart2.click();
	    }
	    @When("user click the add to cart button")
	    public void user_click_the_add_to_cart_button() {
	    	
	    	value.ashopping_cart_link.click();
	        }
	        
	    @Given("the user removes the product from the cart")
	    public void the_user_removes_the_product_from_the_cart() {
	    	
	    	value.remove.click();
	    	value.remove1.click();
	    }
	    @Then("the user should be navigated to the checkout page")
	    public void the_user_should_be_navigated_to_the_checkout_page() {
	    	
	    	value.checkout.click();
	   
	    }
	    @Given("the user enters their first name")
	    public void the_user_enters_their_first_name() {
	    	
	    	value.Firstname.sendKeys("Sabarish");;
	    }
	    @Given("the user enters their last name")
	    public void the_user_enters_their_last_name() {
	    	
	    	value.Lastname.sendKeys("B");;
	    }
	    @Given("the user enters a valid zip code")
	    public void the_user_enters_a_valid_zip_code() throws InterruptedException {
	    	
	    	value.postalcode.sendKeys("600045");
	    	
	    	Thread.sleep(5000);
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0, 500)");
	  
	    }
	
     	@Given("the user click the continue button")
    	public void the_user_click_the_continue_button() {
     		value.Continue.click();
	    
	}
	    @Then("the user should be able to proceed with the checkout process for delivery")
	    public void the_user_should_be_able_to_proceed_with_the_checkout_process_for_delivery() {
	    	
	    	value.finish.click();
	    }
}