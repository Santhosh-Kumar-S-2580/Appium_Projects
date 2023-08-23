package CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public  class CommonUtils {
			
		public static WebDriver driver;
		
		
		//WebDriver driver;
		public static void launchApp() throws FileNotFoundException, IOException {
			
			
			
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--disable-notifications");
			 * options.addArguments("--remote-allow-origins=*");
			 * Common_Step_Definition.driver = new ChromeDriver(options);
			 * Common_Step_Definition.driver.manage().window().maximize();
			 * Common_Step_Definition.driver.manage().timeouts().implicitlyWait(Duration.
			 * ofSeconds(50)); System.out.println("Chrome Browser Launched Sucessfully");
			 * 	//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			///cap.setCapability("automationName", "UiAutomator2");
			//cap.setCapability("automationName", "UiAutomator1");
			 */
			Properties appProps = new Properties();
			appProps.load(new FileInputStream("C:\\Users\\santhosh.kumar\\eclipse-workspace\\Appium_Practice\\Selendriod_Appium.properties"));
			DesiredCapabilities cap= new DesiredCapabilities();
		
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,appProps.getProperty("Automation_name"));
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,appProps.getProperty("DEVICE_NAME"));
			cap.setCapability(MobileCapabilityType.UDID, appProps.getProperty("UDID"));
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, appProps.getProperty("PLATFORM_NAME"));
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,appProps.getProperty("PLATFORM_VERSION"));
			cap.setCapability("autoGrantPermissions", "true");
			cap.setCapability("appPackage",appProps.getProperty("appPackage"));
			cap.setCapability("appActivity",appProps.getProperty("appActivity"));
			//cap.setCapability("autoAcceptAlerts", "true"); // to accept all alerts
			//caps.setCapability("autoDissmissAlerts", "true"); // to dismiss all 
			// To specify the Appium Server
			URL url=new URL(appProps.getProperty("URL"));
			driver =new AndroidDriver(url,cap);			
			System.out.println("Application Started Successfully....");
			
			
		}
		
		public static void initWebElements() {
			PageFactory.initElements(driver,PageObjects.CalculatorPageObjects.class);
			PageFactory.initElements(driver,PageObjects.SelendriodPageObjects.class);
			
		}
		 
		/*
		 * public void takeScrshot() throws Exception { File scrshot=((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE) ; FileUtils.copyFile(scrshot, new
		 * File(Common_Step_Definition.getScenarioName()+".png"));
		 * 
		 * }
		 */
		public static void closeApp() {
			driver.quit();
			System.out.println("Application Closed Successfully");
		}
		public static void navigateBack() {
			driver.navigate().back();
		}
		
		  public static void highLightElement(WebElement element) { 
			  JavascriptExecutor executor=(JavascriptExecutor) driver; //
			  executor. executeScript("arguments[0].setAttribute('style', 'border: 6px solid teal');" , element);
			  //executor. executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')" , element); 
		 // executor. executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');" , element); }
		 
}}
