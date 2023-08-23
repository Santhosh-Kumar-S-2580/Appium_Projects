package Selendriod;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.SelendriodPageObjects;

public class selendriodTest extends SelendriodPageObjects{
	
	
	@BeforeTest
	public void OpenApp() throws FileNotFoundException, IOException {
		CommonUtils.CommonUtils.launchApp();
		CommonUtils.CommonUtils.initWebElements();
		clkContinueBTN();
		clkPERMISSION_OK_BTN();
	}

	@Test
	public void Display_ToastMSG() throws FileNotFoundException, IOException, Exception {
//		CommonUtils.CommonUtils.launchApp();
//		CommonUtils.CommonUtils.initWebElements();
//		clkContinueBTN();
//		clkPERMISSION_OK_BTN();
		clkToastBTN();
		System.out.println("TOAST MESSAGE : " + showToastMSG());
//		clkUserRegisterStartBTN();
//		Thread.sleep(2000);
//		enterUsername("abc@gmail.com");
//		enterEmail("abc@123@gmail.com");
//		enterPWD("123456789");
//		enterName("ABCD");
//		CommonUtils.CommonUtils.navigateBack();
//		clk_LANG_DropDown();
//		clk_LANG_DropDown_option();
//		select_chkbox();
//		clkRegisterBTN();
//		System.out.println("USERNAME : "+ getUserName());
//		System.out.println("PASSWORD : " + getPWD());
//		System.out.println("EMAIL : "+getEmail());
//		System.out.println("NAME : "+getNAME());
//		System.out.println("PROGRAMMING LANGUAGE : "+getPROG_LANG());
//		System.out.println("ACCEPT : "+getACPT_chkBox());
	}
	@Test
	public void register_User() throws Exception {
		clkUserRegisterStartBTN();
		Thread.sleep(2000);
		enterUsername("abc@gmail.com");
		enterEmail("abc@123@gmail.com");
		enterPWD("123456789");
		enterName("ABCD");
		CommonUtils.CommonUtils.navigateBack();
		clk_LANG_DropDown();
		clk_LANG_DropDown_option();
		select_chkbox();
		clkRegisterBTN();
		Thread.sleep(2000);
		System.out.println("USERNAME : "+ getUserName());
		System.out.println("PASSWORD : " + getPWD());
		System.out.println("EMAIL : "+getEmail());
		System.out.println("NAME : "+getNAME());
		System.out.println("PROGRAMMING LANGUAGE : "+getPROG_LANG());
		System.out.println("ACCEPT : "+getACPT_chkBox());
	}
		
		@AfterTest
		public void QuitApp(){
			CommonUtils.CommonUtils.closeApp();
		}
	}


/*
[RemoteTestNG] detected TestNG version 7.4.0
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
Application Started Successfully....
TOAST MESSAGE : Hello selendroid toast!
USERNAME : abc@gmail.com
PASSWORD : 123456789
EMAIL : abc@123@gmail.com
NAME : ABCD
PROGRAMMING LANGUAGE : Python
ACCEPT : true
Application Closed Successfully
PASSED: register_User
PASSED: Display_ToastMSG

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================


*/