package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver = driver;
}
By username = By.name("username");
By password = By.name("password");
By LoginButton = By.xpath("//a[@class='button account']");
By SubmitButton = By.xpath("//button[@type='submit']");
By watchList = By.xpath("//a[@class='button button-small']");

public void enterUsername(String string1)
{
	driver.findElement(username).click();
	driver.findElement(username).clear();
	driver.findElement(username).sendKeys(string1);
}

public void enterPassword(String string2)
{
	driver.findElement(password).click();
	driver.findElement(password).clear();
	driver.findElement(password).sendKeys(string2);
}

public void clickOnLoginButton()
{
	driver.findElement(LoginButton).click();
}

public void submitLogin()
{
	driver.findElement(SubmitButton).click();
}

public int validateWatchListElements()
{
	int watchListEle = driver.findElements(watchList).size();
	return watchListEle;
}
}
