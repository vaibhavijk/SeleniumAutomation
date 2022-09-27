package CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
       features="src/test/java/features/MyOrderLogin.feature",
	   glue="stepDefinations", stepNotifications=true)
public class TestRunner {

}
