package Common_step_def;

import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import CommonUtils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Step_Definition {
	
	private static String scenarioName=null;
		
	public static String getScenarioName() {
		return scenarioName;
	}
	
	
	public static WebDriver driver;
	@Before
	public void beforeScenario(Scenario scenario) throws Exception {
		
		//if(driver==null) {
			scenarioName=scenario.getName();
			
			CommonUtils.getInstance().driverSelection();
			//CommonUtils.getInstance().launchBrowser();
			CommonUtils.getInstance().initWebElements();
		//}
		}
	
	//@After 
	/*
	 * private static Integer scenarioName=null;
	 * 
	 * public static Integer getScenarioName() { return scenarioName; }
	 * 
	 * public static WebDriver driver;
	 * 
	 * @Before public void beforeScenario(Scenario scenario) {
	 * 
	 * //if(driver==null) { scenarioName=scenario.getLine();
	 * CommonUtils.getInstance().launchBrowser();
	 * CommonUtils.getInstance().initWebElements(); //} }
	 */
} 
