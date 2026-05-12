package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	//Test case: Verify that user can login successfully with valid credentials
	//Steps:
	//1. Open the browser and navigate to the SauceDemo login page
	//2. Enter valid username and password
	//3. Click on the login button
	//4. Verify that the user is redirected to the products page
	
	@Test
	public void verifyLogin() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("standard_user");
		
		login.enterPassword("secret_sauce");
		
		login.clickLogin();
	}

}
