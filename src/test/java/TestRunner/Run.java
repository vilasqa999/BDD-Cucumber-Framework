package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = ".//Features/Login.feature",
		glue= "StepDefinition",
		dryRun=false,
		monochrome= true,
		plugin= {"pretty", "html:target/cucumber.html"},
		tags="@sanity and @regresion"
		)

public class Run 
{

}
