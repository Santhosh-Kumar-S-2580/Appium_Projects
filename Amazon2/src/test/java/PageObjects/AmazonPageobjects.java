package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class AmazonPageobjects {
private static AmazonPageobjects AmazonPageobjectInstance=null;
	
	private AmazonPageobjects() {

	}
	
	public static AmazonPageobjects getInstance() {
		if(AmazonPageobjectInstance==null) {
			AmazonPageobjectInstance=new AmazonPageobjects();
		}
		return AmazonPageobjectInstance;
	}
	
	
	@FindBy(xpath="(//div[@id='nav-tools']/a)[2]")
	 private WebElement SignButton;
	@FindBy(id="ap_email")
	private WebElement email;
	@FindBy(id="continue")
	private WebElement ctnBth;
	@FindBy(xpath="//div[@class='a-box-inner a-alert-container']/h4")
	 private WebElement errmsg;
	
	
	
	
	public void clkSignInBtn() {
		CommonUtils.getInstance().highLightElement(SignButton);
		SignButton.click();
	}
	public void clkCtnBtn() {
		CommonUtils.getInstance().highLightElement(ctnBth);
		ctnBth.click();
	}
	
	public void enterEmail(String emailID) {
		CommonUtils.getInstance().highLightElement(email);
		email.sendKeys(emailID);
	}
	
	public String errorMsg() {
		CommonUtils.getInstance().highLightElement(errmsg);
		return errmsg.getText();
	}
	
}
