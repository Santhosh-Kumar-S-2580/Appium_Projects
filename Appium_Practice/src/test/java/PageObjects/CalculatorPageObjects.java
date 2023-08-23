package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPageObjects {

	
	@FindBy(xpath="//android.widget.ImageView[@content-desc='More options']")
	public static WebElement MoreOptions;
	@FindBy(xpath="//*[@text='Choose theme']")
	public static WebElement ChooseTheme;
	@FindBy(xpath="//*[@text='Dark']")
	public static WebElement ThemeSelect;
	@FindBy(xpath="//*[@text='OK']")
	public static WebElement ClickOK;
	
	
	public static void clkMoreOptionsBtn() {
		///CommonUtils.getInstance().highLightElement(MoreOptions);
		MoreOptions.click();
	}
	public static void clkChooseThemeBtn() {
		//CommonUtils.getInstance().highLightElement(ChooseTheme);
		ChooseTheme.click();
	}
	public static void clkThemeSelectBtn() {
		//CommonUtils.getInstance().highLightElement(ThemeSelect);
		ThemeSelect.click();
	}
	public  static void clkClickOKBtn() {
		//CommonUtils.getInstance().highLightElement(ClickOK);
		ClickOK.click();
	}
}
