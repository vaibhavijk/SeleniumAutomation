package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
       //features="src/test/java/feature/Login.feature",
	  // glue="stepDefinations", stepNotifications=true)
		
	 //features="src/test/java/feature/Login.feature",		
     // glue="stepDefinations",tags="@smokeTest")
		
	//features="src/test/java/feature/Login.feature",		
	//glue="stepDefinations",tags="@smokeTest or @regressionTest")
		
	//	features="src/test/java/feature/Login.feature",		
	//	glue="stepDefinations",tags="not @sanityTest")
		
//   features="src/test/java/feature/Login.feature",		
//   glue="stepDefinations",tags="@smokeTest or @regressionTest")
		
	//	features="src/test/java/feature/Login.feature",		
	//   glue="stepDefinations",tags="@MobileTest or @WebTest")
		
		features="src/test/java/feature",		
	    glue="stepDefinations",tags="@portalTest",monochrome=true,
        plugin={"pretty","html:target/cucumber.html"})
public class TestRunner {

}
