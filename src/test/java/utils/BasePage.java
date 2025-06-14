package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	static WebDriver driver;
	ConfigReader input = new ConfigReader();
	String driverPath = input.getProperty("chromeDriverPath");
	
	public WebDriver getDriver() {
	if(driver == null)
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		return driver;
	}
	
	public void quitDriver()
	{
		if(driver != null)
		{
			driver.quit();
			driver = null;
		}
	}
}
