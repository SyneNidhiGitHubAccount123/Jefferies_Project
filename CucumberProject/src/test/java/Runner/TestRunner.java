package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//java//Features//Login.feature",
		format = {"pretty", "html:target/cucumber"},
		glue = {"StepDefinition"}
		
					
		)


public class TestRunner 
{

}
