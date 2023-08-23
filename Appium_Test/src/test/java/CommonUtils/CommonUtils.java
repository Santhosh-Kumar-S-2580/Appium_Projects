package CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import Common_step_def.Common_Step_Definition;
import Pageobjects.calcPageObjects;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class CommonUtils {
			
		
		private static CommonUtils commonUtilsInstance=null;
		
		private CommonUtils() {
			
			
		}
		
		public static CommonUtils getInstance() {
			
			if(commonUtilsInstance==null) {
				commonUtilsInstance=new CommonUtils();
			}
			return commonUtilsInstance;
		}
		
		
		
		//WebDriver driver;
		public void launchBrowser() throws FileNotFoundException, IOException {
			
			
			
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
			appProps.load(new FileInputStream("C:\\Users\\santhosh.kumar\\eclipse-workspace\\Appium_Test\\Appium.properties"));
			DesiredCapabilities cap= new DesiredCapabilities();
		
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,appProps.getProperty("Automation_name"));
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,appProps.getProperty("DEVICE_NAME"));
			cap.setCapability(MobileCapabilityType.UDID, appProps.getProperty("UDID"));
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, appProps.getProperty("PLATFORM_NAME"));
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,appProps.getProperty("PLATFORM_VERSION"));
			cap.setCapability("appPackage",appProps.getProperty("appPackage"));
			cap.setCapability("appActivity",appProps.getProperty("appActivity"));
			

			// To specify the Appium Server
			URL url=new URL(appProps.getProperty("URL"));
			Common_Step_Definition.driver =new AndroidDriver(url,cap);
			System.out.println("Application Started Successfully....");
		}
		
		public void initWebElements() {
			PageFactory.initElements(Common_Step_Definition.driver,Pageobjects.calcPageObjects.getInstance());
			
		}
		 
		public void takeScrshot() throws Exception {
			File scrshot=((TakesScreenshot) Common_Step_Definition.driver).getScreenshotAs(OutputType.FILE) ;
			FileUtils.copyFile(scrshot, new File(Common_Step_Definition.getScenarioName()+".png"));
		
		}
		public void closeApp() {
			Common_Step_Definition.driver.quit();
			System.out.println("Application Closed Successfully");
		}
		
		public void highLightElement(WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor) Common_Step_Definition.driver;
			//executor.executeScript("arguments[0].setAttribute('style', 'border: 6px solid teal');", element);
			//executor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
			executor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			    		}
}
