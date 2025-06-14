package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BasePage;

public class Hooks extends BasePage{
	WebDriver driver;
	@Before
	public void setUp()
	{
		driver = getDriver();
	}	
	
	@After
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Failed test");
        System.out.println("Screenshot taken for failed scenario: " + scenario.getName());
        
		}
		quitDriver();
	}

}
