package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
	
	//Test case: Verify that user can add a product to the cart successfully
	//Steps:
	//1. Open the browser and navigate to the SauceDemo login page
	//2. Enter valid username and password
	//3. Click on the login button
	//4. On the products page, click on the "Add to Cart" button for a product
	//5. Click on the cart icon to view the cart
	//6. Verify that the product is added to the cart
	
	@Test
	public void addProductTest() {
		//Login
		LoginPage login = new LoginPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
		
	// Add product
		ProductPage product = new ProductPage(driver);
		product.addProductToCart();
		product.clickCart();
	}
	
	

}
