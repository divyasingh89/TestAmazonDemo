package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCartDefinitions {
	static WebDriver driver;
	HomePage homepage=new HomePage(driver);
	
	@Given("User is on Amazon Page")
	public void user_is_on_amazon_page() {
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	}

	@And("User search field type {Item}")
	public void user_search_field_type(String item) {
		homepage.searchItem(item);
	    
	}


	@And("User clicks on Add to Cart")
	public void user_clicks_on_add_to_cart() {
		homepage.clickAddToCartButton();
	    
	}
	
	@Then("User validates product price is displayed")
	public void verifyProductPriceIsDisplayed() {
		homepage.getProductPrice();
		
	}

	@When("User clicks on Cart on top left")
	public void user_clicks_on_cart_on_top_left() {
		homepage.clickCartIcon();
	    
	}

	@Then("User verifies cart price to product page")
	public void user_verifies_cart_price_to_product_page() {
	    homepage.validateCartPrice();
	}

	@And("Verifies sub total is identical to product page")
	public void verifies_sub_total_is_identical_to_product_page() {
		 homepage.validateSubtotalPrice();
	   
	}
	
	@And("Verify sub total is calculated correctly")
	public void validateCartValue() {
		homepage.validateMultipleProductsTotal();
	}
	
	@Then("Close the browser")
	public void closeBowser() {
		driver.quit();
	}
}
