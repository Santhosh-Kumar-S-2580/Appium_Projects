package StepDefinition;

import CommonUtils.CommonUtils;
import PageObjects.AmazonPageobjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonMobilefield {
	

	@Given("User is on AMAZON website {string}")
	public void user_is_on_amazon_website(String url) {
		CommonUtils.getInstance().launchUrl(url);
		 System.out.println("Amazon Website Launched Successfully");
	}
	@When("click the SignIn Button")
	public void click_the_sign_in_button() {
		AmazonPageobjects.getInstance().clkSignInBtn();
		System.out.println(" SignIn Button Clicked Successfully");
	}
		
	
	@When("Enter the Mobile Number as {string}")
	public void enter_the_mobile_number_as(String mob) {
		AmazonPageobjects.getInstance().enterEmail(mob);
	}
	@When("Click on Continue")
	public void click_on_continue() {
		AmazonPageobjects.getInstance().clkCtnBtn();
	}
	@Then("User Should be Navigated to Password field")
	public void user_should_be_navigated_to_password_field() throws Exception {
		
	   System.out.println("User Should be Navigated sucessfully to Password field in next page");
	   System.out.println(" TESTCASE " + Status.PASSED+" SUCCESSFULLY " );
	   CommonUtils.getInstance().takeScrshot();
		  CommonUtils.getInstance().AfterScenario();
	}



}
