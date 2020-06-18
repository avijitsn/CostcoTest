package testRunner;

import org.junit.runner.RunWith;  
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions
		(features=".//Features/Login.features",
		glue="stepDefinations",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty", "html:test-output"}
				
				
		)


public class CostcoTestrunner extends AbstractTestNGCucumberTests {

}
