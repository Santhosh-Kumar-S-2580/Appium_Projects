package CommonUtils;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import Common_step_def.Common_Step_Definition;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;


public class CommonUtils {
			
	          
			@SuppressWarnings("deprecation")
			AndroidTouchAction action;
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
			appProps.load(new FileInputStream("C:\\Users\\santhosh.kumar\\eclipse-workspace\\AppiumMobileTesting\\Appium.properties"));
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
			PageFactory.initElements(Common_Step_Definition.driver,Pageobjects.GEN_STOREPageObjects.getInstance());
			
		}
		 
		public void takeScrshot() throws Exception {
			File scrshot=((TakesScreenshot) Common_Step_Definition.driver).getScreenshotAs(OutputType.FILE) ;
			FileUtils.copyFile(scrshot, new File(Common_Step_Definition.getScenarioName()+".png"));
		
		}
		public void takeScrshot1(String filename) throws Exception {
			File scrshot=((TakesScreenshot) Common_Step_Definition.driver).getScreenshotAs(OutputType.FILE) ;
			FileUtils.copyFile(scrshot, new File(filename+".png"));
		
		}
		
		public void takeScrshotOfSpecificElement(String filename,WebElement ele) throws Exception {
		//take screenshot of the page and save it as FILE type
		File scrshot=((TakesScreenshot)Common_Step_Definition.driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.Point p= ele.getLocation();
		 
		//get height and width of element
		int h=ele.getSize().getHeight();
		int w=ele.getSize().getWidth();
		 
//		System.out.println(h);
//		System.out.println(w);
		 
		BufferedImage img=ImageIO.read(scrshot);
		 
		//crop image using the height and width dimensions
		BufferedImage finalImg=img.getSubimage(p.getX(), p.getY(), w, h);
		 
		ImageIO.write(finalImg, "png", scrshot);
		FileUtils.copyFile(scrshot, new File(filename+".PNG"));
		
		}
		
		
		@SuppressWarnings("deprecation")
		public void scrolldown() {
			
			org.openqa.selenium.Dimension dimension = Common_Step_Definition.driver.manage().window().getSize();
			System.out.println("DIMENSION : "+dimension);
			
			int scrollstart = (int)(dimension.getHeight() * 1.0);
			System.out.println("STRAT : "+ scrollstart);
			int scrollend = (int)(dimension.getHeight() * 0.5);
			System.out.println("END : "+scrollend);
			
			 action = new AndroidTouchAction(Common_Step_Definition.driver)
					 .press(PointOption.point(0,scrollstart))
					 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
					 .moveTo(PointOption.point(0,scrollend))
					 .release()
					 .perform();
			
			
			
		}
		public void closeApp() {
			Common_Step_Definition.driver.quit();
			System.out.println("Application Closed Successfully");
		}
		@SuppressWarnings("deprecation")
		public void TAP(WebElement ele) {
			action = new AndroidTouchAction(Common_Step_Definition.driver);
			action.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).perform();
		}
		public void highLightElement(WebElement element) {
			JavascriptExecutor executor=(JavascriptExecutor) Common_Step_Definition.driver;
			//executor.executeScript("arguments[0].setAttribute('style', 'border: 6px solid teal');", element);
			//executor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
			executor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			    		}
}
