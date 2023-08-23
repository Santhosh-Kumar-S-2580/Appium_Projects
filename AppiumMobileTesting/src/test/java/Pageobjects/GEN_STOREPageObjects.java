package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;


public class GEN_STOREPageObjects {
	
	

		
		private static GEN_STOREPageObjects genstorePageObjectInstance=null;
			
			private GEN_STOREPageObjects() {

			}
			
			public static GEN_STOREPageObjects getInstance() {
				if(genstorePageObjectInstance==null) {
					genstorePageObjectInstance=new GEN_STOREPageObjects();
				}
				return genstorePageObjectInstance;
			}
			
			@FindBy(id="com.androidsample.generalstore:id/toolbar_title")
			private WebElement Title;
			@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
			private WebElement CountryDD;
			@FindBy(xpath =".//android.widget.TextView[@text='Algeria']")
			private WebElement selectCountryDD;
			@FindBy(id="com.androidsample.generalstore:id/nameField")
			private WebElement name;
			@FindBy(xpath =".//android.widget.RadioButton[@text='Female']")
			private WebElement Gender_chkbox;
			@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
			private WebElement Shop_REG_Btn;
			@FindBy(xpath=".//hierarchy/android.widget.Toast[1]")
			private WebElement Toast_MSG;
			@FindBy(xpath="//android.widget.ImageView[@resource-id='com.androidsample.generalstore:id/productImage']")
			public static List<WebElement> ProductImage;
			@FindBy(xpath="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']")
			public static List<WebElement> ProductName;
			@FindBy(xpath="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice']")
			public static List<WebElement> ProductPrice;
			@FindBy(xpath="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")
			public static List<WebElement> ProductADDCART;
			@FindBy(xpath="//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']")
			private WebElement ADD_TO_CART_Btn;
			@FindBy(xpath="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/counterText']")
			private WebElement counter;
			
			
			
		
			public String get_CounterText() throws Exception {
				CommonUtils.getInstance().takeScrshotOfSpecificElement("counter", counter);
				return counter.getText();
			}
			public String get_TITLE() throws Exception {
				CommonUtils.getInstance().takeScrshotOfSpecificElement("MAIN_APP_TITLE", Title);
				return Title.getText();
			}
			public void clkADD_TO_CART_Btn() {
				//CommonUtils.getInstance().TAP(ADD_TO_CART_Btn);
				ADD_TO_CART_Btn.click();
			}
			public void clkCountryDD() {
				//CommonUtils.getInstance().TAP(CountryDD);
				CountryDD.click();
			}
			public void clkselectCountryDD() throws Exception {
				CommonUtils.getInstance().takeScrshotOfSpecificElement("selectCountryDD", selectCountryDD);
				//CommonUtils.getInstance().TAP(selectCountryDD);
				selectCountryDD.click();
			}
			public void enterNAME(String firstName) throws Exception {
				
				name.sendKeys(firstName);
				CommonUtils.getInstance().takeScrshotOfSpecificElement("NAME", name);
			}
			public void clkGender_chkbox()throws Exception {
				CommonUtils.getInstance().takeScrshotOfSpecificElement("Gender_chkbox", Gender_chkbox);
				//CommonUtils.getInstance().TAP(Gender_chkbox);
				Gender_chkbox.click();
			}
			public void clkShop_REG_Btn()throws Exception {
				CommonUtils.getInstance().takeScrshotOfSpecificElement("Shop_REG_Btn", Shop_REG_Btn);
				//CommonUtils.getInstance().TAP(Shop_REG_Btn);
				Shop_REG_Btn.click();
			}
			public String get_Toast_MSG() throws Exception {
				CommonUtils.getInstance().takeScrshotOfSpecificElement("Toast_MSG", Toast_MSG);
				return Toast_MSG.getText();
			}
			

}
