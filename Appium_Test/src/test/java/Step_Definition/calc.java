package Step_Definition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import CommonUtils.CommonUtils;
import Pageobjects.calcPageObjects;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class calc {
	

	@Given("open the calculator")
	public void open_the_calculator() {
		
		System.out.println("CALCULATOR OPENED SUCCESSFULLY !");
	
	}
	@When("change Theme")
	public void change_theme() {
		
		calcPageObjects.getInstance().clkMoreOptionsBtn();
		calcPageObjects.getInstance().clkChooseThemeBtn();
		calcPageObjects.getInstance().clkThemeSelectBtn();
		calcPageObjects.getInstance().clkClickOKBtn();
		
		System.out.println("CALCULATOR THEME CHANGED SUCCESSFULLY !");
	  
	}
	@Then("perform calculation & Print the Result")
	public void perform_calculation_print_the_result() {
		
		System.out.println("No.of.Buttons : " + calcPageObjects.CalcBtns.size());
		System.out.println("CALCULATOR BUTTONS ");
		for(int i=0;i<calcPageObjects.CalcBtns.size();i++) {

			System.out.println(i+ ")" + "Resource Id(ID) : " + calcPageObjects.CalcBtns.get(i).getAttribute("resource-id") + "\t Content of the Resource(content-desc) : "+ calcPageObjects.CalcBtns.get(i).getAttribute("content-desc"));
			
			calcPageObjects.CalcBtns.get(i).click();
		}
		
		
		
		//calcPageObjects.CalcBtns.get(5).click();
		calcPageObjects.getInstance().clkCLR_BTN();
		//To Perform calculation
		calcPageObjects.getInstance().clksecond_BTN();
		calcPageObjects.getInstance().clkfifth_BTN();
		calcPageObjects.getInstance().clkADD_BTN();
		calcPageObjects.getInstance().clksecond_BTN();
		calcPageObjects.getInstance().clkfifth_BTN();
		
		
		System.out.println("Result 1 : "+calcPageObjects.getInstance().getResultTxt());
		calcPageObjects.getInstance().clkEQLTO_BTN();
	//	calcPageObjects.CalcBtns.get(24).click();//click equalsTo
		calcPageObjects.getInstance().clkMUL_BTN();
		calcPageObjects.getInstance().clksecond_BTN();
		
		System.out.println("Result 2 : "+calcPageObjects.getInstance().getResultTxt());
		if(calcPageObjects.getInstance().getResultTxt().equals("100")) {
			System.out.println("Test Passed Successfully");

		}
		//calcPageObjects.CalcBtns.get(24).click();
		calcPageObjects.getInstance().clkEQLTO_BTN();
		calcPageObjects.getInstance().clkCLR_BTN();

		
		System.out.println("PERFORM CALCULATIONS SUCCESSFULLY !");
		
		
		
		CommonUtils.getInstance().closeApp();
		
		System.out.println("CALCULATOR CLOSED SUCCESSFULLY!");
	    
	}




}

























//DesiredCapabilities capabilities=new DesiredCapabilities();
//capabilities.setCapability("platformName", "Android");
//capabilities.setCapability("platformVersion", "10");
//capabilities.setCapability("udid", "ZF652253BB");
//capabilities.setCapability("deviceName", "motorola one macro");
//capabilities.setCapability("appPackage", "com.google.android.calendar");
//capabilities.setCapability("appActivity", "/com.google.android.calendar.AllInOneCalendarActivity");


