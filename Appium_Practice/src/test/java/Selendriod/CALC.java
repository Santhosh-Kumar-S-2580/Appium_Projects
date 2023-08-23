package Selendriod;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.CalculatorPageObjects;

public class CALC extends CalculatorPageObjects {
	 
	
@Test
public void change_theme() throws FileNotFoundException, IOException {
		
	
	 CommonUtils.CommonUtils.launchApp();
	 CommonUtils.CommonUtils.initWebElements();
	 clkMoreOptionsBtn();
	 clkChooseThemeBtn();
	 clkThemeSelectBtn();
	 clkClickOKBtn();
	 
	 CommonUtils.CommonUtils.closeApp();
	 
	 
	
	
//		calcPageObjects.getInstance().clkMoreOptionsBtn();
//		calcPageObjects.getInstance().clkChooseThemeBtn();
//		calcPageObjects.getInstance().clkThemeSelectBtn();
//		calcPageObjects.getInstance().clkClickOKBtn();
		
		System.out.println("CALCULATOR THEME CHANGED SUCCESSFULLY !");
	  
	}
}
