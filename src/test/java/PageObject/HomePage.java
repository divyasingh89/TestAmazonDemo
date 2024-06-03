package PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class HomePage {
	WebDriver ldriver;


	public HomePage(WebDriver rDriver) {

		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);

	}

	@FindBy(id="twotabsearchtextbox") private static WebElement searchBox;
	@FindBy(id="a-autoid-1-announce")private static WebElement addToCartButton;
	@FindBy(id="nav-cart-count")private static WebElement cartIcon;
	@FindBy(className ="//span[@class='a-price-whole']") private static WebElement productPagePriceText;
	@FindBy(xpath = "//span[text()='Price']//following::div[@class='sc-badge-price']")private static WebElement priceText;
	@FindBy(xpath = "//span[contains(text(),'Subtotal')]//following::span[@id='sc-subtotal-amount-activecart']")private static WebElement subTotalText;



	public void searchItem(String item) {
		searchBox.sendKeys(item);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void clickAddToCartButton() {
		addToCartButton.click();
	}
	
	public void clickCartIcon() {
		cartIcon.click();
		
	}
	
	public String getProductPrice() {
		productPagePriceText.isDisplayed();
		String productPagePrice=productPagePriceText.getText();
		return productPagePrice;
		
	}
	
	public void validateCartPrice() {
		String price=priceText.getText();
		assertEquals(getProductPrice(), price);
		
	}
	
	
	public void validateSubtotalPrice() {
		assertEquals(getProductPrice(), subTotalText.getText());
		
		
	}
	
	public void calculateProductTotal() {
		@
	}
	

	





}
