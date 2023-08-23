package Runner;

import org.junit.Test;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
				glue={"StepDefinition","CommonUtils","Common_step_def"},
				dryRun=false,
				monochrome=false,
				plugin={"pretty","html:report/htmlreport.html"},
				publish=true)

public class AmazonRunner {

}
