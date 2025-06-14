package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utils.BasePage;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	WebDriver driver ;
	By searchField = By.xpath("(//input[@placeholder='Search for a company'])[3]");
	By companyName = By.xpath("//div[@id='top']//h1");
	By peersLink = By.xpath("//a[contains(text(),'Peers')]");
	By peersList = By.xpath("//div[@id='peers-table-placeholder']//tr");
	
	public void searchStock(String stock)
	{
		driver.findElement(searchField).click();
		driver.findElement(searchField).sendKeys(stock);
		driver.findElement(searchField).sendKeys(Keys.ENTER);
	}
	
	public String getStockName()
	{
		String stockName = driver.findElement(companyName).getText();
		return stockName;
	}
	
	public void clickOnPeersLink()
	{
		driver.findElement(peersLink).click();
	}
	
	public int getnumberOfPeers()
	{
		int peers = driver.findElements(peersList).size();
		return peers;
	}
}
