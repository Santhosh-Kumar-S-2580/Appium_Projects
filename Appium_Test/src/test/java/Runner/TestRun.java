package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/Calculator.feature",
				glue={"Step_Definition","CommonUtils","Common_step_def"},
				dryRun=false,
				monochrome=false,
				plugin={"pretty","html:report/htmlreport.html"},
				publish=true)
public class TestRun {

}
