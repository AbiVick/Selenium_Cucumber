package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
        
                //features = ".\\Features\\NewLogin.feature",
				features = ".\\Features\\",
                glue = "steps",
                plugin = {"pretty" ,"html: test-output"},
                monochrome = true,
                dryRun = false,
              //tags = "@ibm_sanity"
                //tags = "@ibm_regression"
                tags = "@ibm_sanity"
        
                )

public class TestRunner {

}
