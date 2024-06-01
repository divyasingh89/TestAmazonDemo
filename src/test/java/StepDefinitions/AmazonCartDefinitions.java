package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCartDefinitions {
	static WebDriver driver;
	
	@Given("User is on Amazon Page")
	public void user_is_on_amazon_page() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in/");
	}

	@And("User search field type <>")
	public void user_search_field_type() {
	    
	}

	@Then("User selects item in the list")
	public void user_selects_item_in_the_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("User clicks on Add to Cart")
	public void user_clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Cart on top left")
	public void user_clicks_on_cart_on_top_left() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User verifies cart price to product page")
	public void user_verifies_cart_price_to_product_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Verifies sub total is identical to product page")
	public void verifies_sub_total_is_identical_to_product_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
