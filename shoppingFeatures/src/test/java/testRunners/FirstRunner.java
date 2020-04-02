package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue = {"stepsDefinitions"},
		tags = "@TestCase12"
		
		)

public class FirstRunner extends AbstractTestNGCucumberTests{

}