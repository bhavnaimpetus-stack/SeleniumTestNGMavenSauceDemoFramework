package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	
WebDriver driver;

public ProductPage(WebDriver driver) {
	this.driver=driver;
}

//Locators
By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

By cartIcon = By.className("shopping_cart_link");

//Methods
public void addProductToCart() {
	driver.findElement(addToCartButton).click();
}

public void clickCart() {
	driver.findElement(cartIcon).click();
}
}
