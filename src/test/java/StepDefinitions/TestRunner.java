package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"src/test/resources/Features/calculate.feature"},glue= {"StepDefinitions"},
	plugin = {"junit:target/cucumber-reports/cucumber.xml"},
	monochrome = true,
	tags = "@division"
	)
	 
	public class TestRunner {

	}


