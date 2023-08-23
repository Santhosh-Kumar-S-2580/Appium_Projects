package Step_Definition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import CommonUtils.CommonUtils;
import Common_step_def.Common_Step_Definition;
import Pageobjects.GEN_STOREPageObjects;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GEN_STORE {
	

	@Given("open General store Application")
	public void open_the_calculator() throws Exception {
		
		String text="PG 3";
		CommonUtils.getInstance().takeScrshot1("GENERAL_STORE_REGISTER_PAGE _BEFORE");
		System.out.println("General Store App OPENED SUCCESSFULLY !");
		System.out.println("TITLE : "+GEN_STOREPageObjects.getInstance().get_TITLE());
		GEN_STOREPageObjects.getInstance().clkCountryDD();
		GEN_STOREPageObjects.getInstance().clkselectCountryDD();
		GEN_STOREPageObjects.getInstance().enterNAME("SANTHOSH");
		GEN_STOREPageObjects.getInstance().clkGender_chkbox();
		GEN_STOREPageObjects.getInstance().clkShop_REG_Btn();
		CommonUtils.getInstance().takeScrshot1("GENERAL_STORE_REGISTER_PAGE _AFTER");
		
		Thread.sleep(5000);
		
		//Common_Step_Definition.driver.findElement(null)
		///Common_Step_Definition.driver.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click(); 
		Common_Step_Definition.driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())"+".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
		
		
		for(int i=0;i<3;i++) {
			
			if(GEN_STOREPageObjects.ProductName.get(i).getText().equalsIgnoreCase("Nike SFB Jungle")) {
				System.out.println("TITLE : "+GEN_STOREPageObjects.getInstance().get_TITLE());
			System.out.println("===================================");
			System.out.println((i+1)+" ) " +"PRODUCT DETAILS  :");
			System.out.println("===================================");
			CommonUtils.getInstance().takeScrshotOfSpecificElement(GEN_STOREPageObjects.ProductName.get(i).getText(), GEN_STOREPageObjects.ProductImage.get(i));
			System.out.println("PRODUCT NAME : "+ GEN_STOREPageObjects.ProductName.get(i).getText());
			System.out.println("PRODUCT PRICE : "+ GEN_STOREPageObjects.ProductPrice.get(i).getText());
			System.out.println("====================================");
		    GEN_STOREPageObjects.getInstance().ProductADDCART.get(i).click();
		    System.out.println("PRODUCT ADDED TO THE CART SUCCESSFULLY");
		    Thread.sleep(2000);
		    System.out.println("CONTER TEXT : "+GEN_STOREPageObjects.getInstance().get_CounterText()); 
		    GEN_STOREPageObjects.getInstance().clkADD_TO_CART_Btn();
		    CommonUtils.getInstance().takeScrshot1("PRODUCT PAGE");
		    System.out.println("TITLE : "+GEN_STOREPageObjects.getInstance().get_TITLE());
		    Thread.sleep(2000);
		    CommonUtils.getInstance().takeScrshot1("CART PAGE");
		    
			}
		}
		 CommonUtils.getInstance().closeApp();
	
	
	}
	@When("ENter the user details")
	public void change_theme() {
		
		/*
		 * calcPageObjects.getInstance().clkMoreOptionsBtn();
		 * calcPageObjects.getInstance().clkChooseThemeBtn();
		 * calcPageObjects.getInstance().clkThemeSelectBtn();
		 * calcPageObjects.getInstance().clkClickOKBtn();
		 * 
		 * System.out.println("CALCULATOR THEME CHANGED SUCCESSFULLY !");
		 */
	}
	@Then("click let's shop button")
	public void perform_calculation_print_the_result() {
	



}}












/*System.out.println("IMAGES SIZE : "+GEN_STOREPageObjects.ProductImage.size());
for(int i=0;i<10;i++) {
	System.out.println("===================================");
	System.out.println((i+1)+" ) " +"PRODUCT DETAILS  :");
	System.out.println("===================================");
	CommonUtils.getInstance().takeScrshotOfSpecificElement(GEN_STOREPageObjects.ProductName.get(i).getText(), GEN_STOREPageObjects.ProductImage.get(i));
	System.out.println("PRODUCT NAME : "+ GEN_STOREPageObjects.ProductName.get(i).getText());
	System.out.println("PRODUCT PRICE : "+ GEN_STOREPageObjects.ProductPrice.get(i).getText());
	System.out.println("====================================");
	Thread.sleep(2000);
	CommonUtils.getInstance().scrolldown();
	Thread.sleep(2000);
}
*/












//DesiredCapabilities capabilities=new DesiredCapabilities();
//capabilities.setCapability("platformName", "Android");
//capabilities.setCapability("platformVersion", "10");
//capabilities.setCapability("udid", "ZF652253BB");
//capabilities.setCapability("deviceName", "motorola one macro");
//capabilities.setCapability("appPackage", "com.google.android.calendar");
//capabilities.setCapability("appActivity", "/com.google.android.calendar.AllInOneCalendarActivity");


