package StepDefinition;

import CommonUtils.CommonUtils;
import PageObjects.AmazonPageobjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonInvalidmobile {
	
	@Given("User go  AMAZON website {string}")
	public void user_go_amazon_website(String url) {
		
		CommonUtils.getInstance().launchUrl(url);
		 System.out.println("Amazon Website Launched Successfully");
	}
	@When("click on  the SignIn Button")
	public void click_on_the_sign_in_button() {
		AmazonPageobjects.getInstance().clkSignInBtn();
		System.out.println(" SignIn Button Clicked Successfully");
	}
	@When("Enter the Invalid Mobile Number as {string}")
	public void enter_the_invalid_mobile_number_as(String mob) {
		AmazonPageobjects.getInstance().enterEmail(mob);
	}
	@Then("User Should be get the error message & Error Message As {string}")
	public void user_should_be_get_the_error_message_error_message_as(String err) throws Exception {
		System.out.println("Error Message : "+AmazonPageobjects.getInstance().errorMsg());
		if(AmazonPageobjects.getInstance().errorMsg().equalsIgnoreCase(err)) {
			System.out.println("User Should be get the error message");
			System.out.println(" TESTCASE " + Status.PASSED+" SUCCESSFULLY  " );
			   CommonUtils.getInstance().takeScrshot();
				  CommonUtils.getInstance().AfterScenario();
		}
	}



}
