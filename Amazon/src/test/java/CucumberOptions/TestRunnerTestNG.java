package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	       features="src/test/java/feature",
		   glue="StepDefination", monochrome=true)
public class TestRunnerTestNG  extends AbstractTestNGCucumberTests{
}

