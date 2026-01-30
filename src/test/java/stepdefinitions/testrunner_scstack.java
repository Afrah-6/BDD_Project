package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/scstack.feature", glue="stepdefinitions", 
   monochrome=true
		)

public class testrunner_scstack extends AbstractTestNGCucumberTests {

}
