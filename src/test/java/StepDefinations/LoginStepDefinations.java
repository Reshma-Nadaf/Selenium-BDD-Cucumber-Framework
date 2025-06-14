package StepDefinations;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import WebPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BasePage;
import utils.ConfigReader;

public class LoginStepDefinations extends BasePage {
	
	WebDriver driver;
	LoginPage login;
	
	ConfigReader input = new ConfigReader();
	String url = input.getProperty("url");
	
	@Given("User launches the url site")
	public void user_launches_the_url_site() {
		
		driver = getDriver();
		if (driver == null) {
			System.out.println("❌ WebDriver not initialized!");
			throw new RuntimeException("WebDriver not initialized");
		}
		
		driver.get(url);
		login = new LoginPage(driver);		
	}

	@When("User opens the Login Page")
	public void user_opens_the_login_page() {
		login.clickOnLoginButton();
	}

	@And("User enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		login.enterUsername(username);
		login.enterPassword(password);
		login.submitLogin();
	}

	@Then("User validate the Login page is working")
	public void User_validate_the_login_page_is_working() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  Assert.assertTrue(login.validateWatchListElements() > 0,"login test passed");
	  //quitDriver();
	}
}
