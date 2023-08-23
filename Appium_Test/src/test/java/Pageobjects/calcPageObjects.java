package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;


public class calcPageObjects {
	
	

		
		private static calcPageObjects calcPageObjectInstance=null;
			
			private calcPageObjects() {

			}
			
			public static calcPageObjects getInstance() {
				if(calcPageObjectInstance==null) {
					calcPageObjectInstance=new calcPageObjects();
				}
				return calcPageObjectInstance;
			}
			
			@FindBy(xpath="//android.widget.ImageView[@content-desc='More options']")
			private WebElement MoreOptions;
			@FindBy(xpath="//*[@text='Choose theme']")
			private WebElement ChooseTheme;
			@FindBy(xpath="//*[@text='Dark']")
			private WebElement ThemeSelect;
			@FindBy(xpath="//*[@text='OK']")
			private WebElement ClickOK;
			@FindBy(xpath="//android.widget.ImageButton")
			public static List<WebElement> CalcBtns;
			@FindBy(id="com.google.android.calculator:id/result_preview")
			private WebElement result;
			@FindBy(id="com.google.android.calculator:id/digit_2")
			private WebElement second_BTN;
			@FindBy(id="com.google.android.calculator:id/digit_5")
			private WebElement fifth_BTN;
			@FindBy(id="com.google.android.calculator:id/op_add")
			private WebElement ADD_BTN;
			@FindBy(id="com.google.android.calculator:id/op_mul")
			private WebElement MUL_BTN;
			@FindBy(id="com.google.android.calculator:id/clr")
			private WebElement CLR_BTN;
			@FindBy(id="com.google.android.calculator:id/eq")
			private WebElement EQLTO_BTN;
			
			
			
			
			
		
			
			/*@FindBy(linkText="Profile")
			 private WebElement ProfileBtn;
			@FindBy(xpath="(//a[@class='f-left'])[2]")
			private WebElement SignInBtn;
			@FindBy(id="salutation")
			private WebElement SalutationDD;
			@FindBy(id="firstname")
			private WebElement fname; 
			@FindBy(id="lastname")
			private WebElement lname;
			@FindBy(id="email_address")
			private WebElement email;
			@FindBy(id="mobile")
			private WebElement mobile;
			@FindBy(id="password")
			private WebElement pwd;
			@FindBy(id="confirmation")
			private WebElement cfmpwd;
			@FindBy(css="button.button.customsave")
			private WebElement register;
			@FindBy(className="success-msg")
			private WebElement SuccessMsg;
			
			
			
			
			public void clkProfileBtn() {
				CommonUtils.getInstance().highLightElement(ProfileBtn);
				ProfileBtn.click();
			}
			public void clkSignInBtn() {
				CommonUtils.getInstance().highLightElement(SignInBtn);
				SignInBtn.click();
			}

			public WebElement getSalutationDD() {
				CommonUtils.getInstance().highLightElement(SalutationDD);
				return SalutationDD;
			}
			public void enterProfileFirstname(String firstName) {
				CommonUtils.getInstance().highLightElement(fname);
				fname.sendKeys(firstName);
			}
			public void enterProfileLastName(String LastName) {
				CommonUtils.getInstance().highLightElement(lname);
				lname.sendKeys(LastName);
			}
			public void enterProfileEmail(String emailID) {
				CommonUtils.getInstance().highLightElement(email);
				email.sendKeys(emailID);
			}
			public void enterProfileMobile(String Phno) {
				CommonUtils.getInstance().highLightElement(mobile);
				mobile.sendKeys(Phno);
			}
			public void enterProfilePwd(String Pass) {
				CommonUtils.getInstance().highLightElement(pwd);
				pwd.sendKeys(Pass);
			}
			public void enterProfileCfmPwd(String Pass1) {
				CommonUtils.getInstance().highLightElement(cfmpwd);
				cfmpwd.sendKeys(Pass1);
			}
			public void clkRegisterBtn() {
				CommonUtils.getInstance().highLightElement(register);
				register.click();
			}
			public String ProfileSuccessMsg() {
				CommonUtils.getInstance().highLightElement(SuccessMsg);
				return SuccessMsg.getText();
			}
		}*/
			public void clkMoreOptionsBtn() {
				///CommonUtils.getInstance().highLightElement(MoreOptions);
				MoreOptions.click();
			}
			public void clkChooseThemeBtn() {
				//CommonUtils.getInstance().highLightElement(ChooseTheme);
				ChooseTheme.click();
			}
			public void clkThemeSelectBtn() {
				//CommonUtils.getInstance().highLightElement(ThemeSelect);
				ThemeSelect.click();
			}
			public void clkClickOKBtn() {
				//CommonUtils.getInstance().highLightElement(ClickOK);
				ClickOK.click();
			}
			
			public String getResultTxt() {
				//CommonUtils.getInstance().highLightElement(result);
				return result.getText();
			}
			public void clksecond_BTN() {
				//CommonUtils.getInstance().highLightElement(second_BTN);
				second_BTN.click();
			}
			public void clkfifth_BTN() {
				//CommonUtils.getInstance().highLightElement(fifth_BTN);
				fifth_BTN.click();
			}
			public void clkADD_BTN() {
				//CommonUtils.getInstance().highLightElement(ADD_BTN);
				ADD_BTN.click();
			}
			public void clkMUL_BTN() {
				//CommonUtils.getInstance().highLightElement(MUL_BTN);
				MUL_BTN.click();
			}
			public void clkCLR_BTN() {
				//CommonUtils.getInstance().highLightElement(MUL_BTN);
				CLR_BTN.click();
			}
			public void clkEQLTO_BTN() {
				//CommonUtils.getInstance().highLightElement(MUL_BTN);
				EQLTO_BTN.click();
			}
			
			
			

}
