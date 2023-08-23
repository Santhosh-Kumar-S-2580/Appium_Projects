package Runner;



import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="Features/General_Store.feature",
				glue={"Step_Definition","CommonUtils","Common_step_def"},
				dryRun=false,
				monochrome=false,
				plugin={"pretty","html:report/htmlreport.html"},
				publish=true)
public class TestRun extends AbstractTestNGCucumberTests {
	/*
	 * SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss"); Date
	 * today=new Date(); String timestamp=sdf.format(today);
	 */
	
	
	
}
