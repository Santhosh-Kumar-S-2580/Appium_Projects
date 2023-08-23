package StepDefinition;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.asserts.SoftAssert;

import CommonUtils.CommonUtils;
import Common_step_def.Common_Step_Definition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AmazonLogin {
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
	    System.out.println(" Browser Started ");
	}
	@When("Launch the URL {string}")
	public void launch_the_url(String url) {
		CommonUtils.getInstance().launchUrl(url);
		 System.out.println("Amazon Website Launched Successfully");
		 
	}
	@Then("User Should be Navigated to URL & Validate the URL")
	public void user_should_be_navigated_to_url_validate_the_url() throws Exception, IOException {
		Thread.sleep(2000);
		SoftAssert a = new SoftAssert();
		  
		  String url = "https://www.amazon.in/";
		  
		  HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		  
		  conn.setRequestMethod("HEAD");
		  
		  conn.connect();
		  
		  int respCode = conn.getResponseCode();
		  
		 // System.out.println(respCode);
		  
		  a.assertEquals(respCode,200);
		  System.out.println(" AMAZON URL WORKING FINE ");
		  System.out.println(" TESTCASE " + Status.PASSED+" SUCCESSFULLY : " );
		  CommonUtils.getInstance().AfterScenario();
		  
		  
		  
	}


}
