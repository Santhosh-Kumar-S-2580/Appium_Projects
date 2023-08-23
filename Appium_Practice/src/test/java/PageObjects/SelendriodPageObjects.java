package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelendriodPageObjects {
	
	
	
	
	@FindBy(id="com.android.permissioncontroller:id/continue_button")
	public static WebElement ContinueBTN;
	
	@FindBy(xpath =".//android.widget.Button[@text='OK']")
	public static WebElement PERMISSION_OK_BTN;
	
	@FindBy(id="io.selendroid.testapp:id/showToastButton")
	public static WebElement ToastBTN;
	@FindBy(xpath="/hierarchy/android.widget.Toast")
	public static WebElement ToastMSG;
	//driver.findElement(By.id("io.selendroid.testapp:id/showToastButton")).click();	
	//System.out.println(driver.findElement(By.xpath("/hierarchy/android.widget.Toast")).getText());
	@FindBy(id="io.selendroid.testapp:id/startUserRegistration")
	public static WebElement UserRegisterStartBTN;
	@FindBy(id="io.selendroid.testapp:id/inputUsername")
	public static WebElement EnterUsername;
	@FindBy(id="io.selendroid.testapp:id/inputEmail")
	public static WebElement EnterEmail;
	@FindBy(id="io.selendroid.testapp:id/inputPassword")
	public static WebElement EnterPWD; 
	@FindBy(id="io.selendroid.testapp:id/inputName")
	public static WebElement EnterNAME; 
	@FindBy(id="io.selendroid.testapp:id/input_preferedProgrammingLanguage")
	public static WebElement LANG_DropDown; 
	@FindBy(xpath=".//android.widget.CheckedTextView[@text='Python']")
	public static WebElement LANG_DropDown_Option; 
	@FindBy(id="io.selendroid.testapp:id/input_adds")
	public static WebElement chkBox; 
	@FindBy(id="io.selendroid.testapp:id/btnRegisterUser")
	public static WebElement RegisterBTN;
	
	
	@FindBy(id="io.selendroid.testapp:id/label_username_data")
	public static WebElement Username;
	@FindBy(id="io.selendroid.testapp:id/label_email_data")
	public static WebElement Email;
	@FindBy(id="io.selendroid.testapp:id/label_password_data")
	public static WebElement PWD; 
	@FindBy(id="io.selendroid.testapp:id/label_name_data")
	public static WebElement NAME; 
	@FindBy(id="io.selendroid.testapp:id/label_preferedProgrammingLanguage_data")
	public static WebElement PROG_LANG; 
	@FindBy(id="io.selendroid.testapp:id/label_acceptAdds_data")
	public static WebElement ACPT_chkBox; 
	
	
	
	public static void clkContinueBTN() {
		//CommonUtils.CommonUtils.highLightElement(ContinueBTN);
		ContinueBTN.click();
	}
	public static void clkPERMISSION_OK_BTN() {
		PERMISSION_OK_BTN.click();
	}
	public static void clkToastBTN() {
		ToastBTN.click();
	}
	public static String showToastMSG() {
		return ToastMSG.getText();
		
	}
	public static void clkUserRegisterStartBTN() {
		UserRegisterStartBTN.click();
	}
	public static void enterUsername(String usrname) {
		EnterUsername.sendKeys(usrname);
		
	}
	public static void enterEmail(String email) {
		EnterEmail.sendKeys(email);
	}
	public static void enterPWD(String pwd) {
		EnterPWD.sendKeys(pwd);
	}
	public static void enterName(String name) {
		EnterNAME.clear();
		EnterNAME.sendKeys(name);
	}
	public static void clk_LANG_DropDown() {
		LANG_DropDown.click();
	}
	public static void clk_LANG_DropDown_option() {
		LANG_DropDown_Option.click();
	}
	public static void select_chkbox() {
		chkBox.click();
	}
	public static void clkRegisterBTN() {
		RegisterBTN.click();
	}
	
	public static String getUserName() {
		return Username.getText();
	}
	public static String getEmail() {
		return Email.getText();
	}
	public static String getPWD() {
		return PWD.getText();
	}
	public static String getNAME() {
		return NAME.getText();
	}
	public static String getPROG_LANG() {
		return PROG_LANG.getText();
	}
	public static String getACPT_chkBox() {
		return ACPT_chkBox.getText();
	}
	
}
























/*
 * id - io.selendroid.testapp:id/startUserRegistration id -
 * io.selendroid.testapp:id/inputUsername id -
 * io.selendroid.testapp:id/inputEmail
 * 
 * id - io.selendroid.testapp:id/inputPassword
 * 
 * id - io.selendroid.testapp:id/inputName
 * 
 * id - io.selendroid.testapp:id/input_preferedProgrammingLanguage xpath -
 * //.android.widget.CheckedTextView[@text='Python']
 * 
 * id - io.selendroid.testapp:id/input_adds - checkbox
 * 
 * id - io.selendroid.testapp:id/btnRegisterUser
 * 
 * 
 * id - io.selendroid.testapp:id/label_name_data
 * 
 * id - io.selendroid.testapp:id/label_username_data
 * 
 * id - io.selendroid.testapp:id/label_password_data
 * 
 * id - io.selendroid.testapp:id/label_email_data id -
 * io.selendroid.testapp:id/label_preferedProgrammingLanguage_data
 * 
 * id - io.selendroid.testapp:id/label_acceptAdds_data
 * 
 * io.selendroid.testapp:id/buttonRegisterUser
 */
