package base;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {

	    WebDriverManager.chromedriver().setup();

	    ChromeOptions options = new ChromeOptions();

	    // Disable notifications
	    options.addArguments("--disable-notifications");

	    // Open in incognito
	    options.addArguments("--incognito");

	    // Disable password manager + breach popup
	    options.setExperimentalOption("prefs", Map.of(
	            "credentials_enable_service", false,
	            "profile.password_manager_enabled", false,
	            "profile.password_manager_leak_detection", false
	    ));

	    driver = new ChromeDriver(options);

	    driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://www.saucedemo.com/");
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
