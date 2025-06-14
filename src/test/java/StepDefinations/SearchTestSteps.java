package StepDefinations;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import WebPages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BasePage;
import utils.ConfigReader;
public class SearchTestSteps extends BasePage{

WebDriver driver;
SearchPage search;


ConfigReader input = new ConfigReader();
String url = input.getProperty("url");
String stockName = input.getProperty("stock");

@Given("User has lauched the screener site")
public void user_has_lauched_the_screener_site() {
	driver = getDriver();
	driver.get(url);
	search = new SearchPage(driver);
	
}

@When("user enters stock name to search")
public void user_enters_stock_name_to_search() {
   search.searchStock(stockName);
}

@Then("searched stock is displayed")
public void searched_stock_is_displayed() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  Assert.assertEquals(search.getStockName(),"HDFC Bank Ltd");
}

@And("user is able to navigate to view peers")
public void user_is_able_to_navigate_to_view_peers() {
	search.clickOnPeersLink();
	Assert.assertEquals(search.getnumberOfPeers(), 9);
}
}
