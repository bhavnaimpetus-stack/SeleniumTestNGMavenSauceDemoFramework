package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
	
	//Test case: Verify that user can proceed to checkout successfully
	//Steps:
	//1. Open the browser and navigate to the SauceDemo login page
	//2. Enter valid username and password
	//3. Click on the login button
	//4. Add a product to the cart
	//5. Click on the cart icon
	//6. Click on the checkout button
	//7. Verify that the user is redirected to the checkout page
	 @Test
	    public void completeCheckoutProcess() {

	        // Login
	        LoginPage login = new LoginPage(driver);

	        login.enterUsername("standard_user");

	        login.enterPassword("secret_sauce");

	        login.clickLogin();

	        // Add Product
	        ProductPage product =
	                new ProductPage(driver);

	        product.addProductToCart();

	        product.clickCart();

	        // Cart
	        CartPage cart = new CartPage(driver);

	        cart.clickCheckout();

	        // Checkout
	        CheckoutPage checkout =
	                new CheckoutPage(driver);

	        checkout.enterFirstName("Bhavna");

	        checkout.enterLastName("Chawda");

	        checkout.enterPostalCode("400054");

	        checkout.clickContinue();

	        checkout.clickFinish();
	    }
	
	

}
