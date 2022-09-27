package CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
       features="src/test/java/feature/HomePage.feature",
	   glue="StepDefinations", monochrome=true)
public class TestRunnerTestNg  extends AbstractTestNGCucumberTests{

}
