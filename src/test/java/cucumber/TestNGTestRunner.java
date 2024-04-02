package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
	    features = "/Users/vk14/eclipse-workspace/AgencyPortal/src/test/java/cucumber/SmokeTesting.feature",
	    glue = "com.pixbit.agencyportal.smoketesting",
	    monochrome = true,
	    plugin = {"html:target/cucumber.html"}
	)
	public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	}
