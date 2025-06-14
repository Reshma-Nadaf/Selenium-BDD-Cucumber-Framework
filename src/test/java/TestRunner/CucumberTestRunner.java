package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke", features= {"src/test/resources/Features/LoginTDD.feature"},
glue= {"StepDefinations","Hooks"},
monochrome = true,
plugin= {"pretty","html:target/htmlreport.html"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
