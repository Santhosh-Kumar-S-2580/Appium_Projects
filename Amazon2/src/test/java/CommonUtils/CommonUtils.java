package CommonUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import PageObjects.AmazonPageobjects;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import Common_step_def.Common_Step_Definition;

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
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		Common_Step_Definition.driver = new ChromeDriver(options);
		Common_Step_Definition.driver.manage().window().maximize();
		Common_Step_Definition.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println("Chrome Browser Launched Sucessfully");
	}
	public void launchBrowser1() throws Exception {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("--remote-allow-origins=*");
//		Common_Step_Definition.driver = new ChromeDriver(options);
//		Common_Step_Definition.driver.manage().window().maximize();
//		Common_Step_Definition.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		System.out.println("Chrome Browser Launched Sucessfully");
		// To Set the Desired Capabilities
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		//cap.setCapability("automationName", "UiAutomator2");
		//cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"motorola one macro");
		cap.setCapability(MobileCapabilityType.UDID, "ZF652253BB");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	
		

		// To specify the Appium Server
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		Common_Step_Definition.driver=new AndroidDriver(url,cap);
		System.out.println("Application Started Successfully....");
	}
	
	public void driverSelection() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("SELECT THE DRIVER \n 1.WebDriver \n 2.AndroidDriver");
		int Driveroption=sc.nextInt();
		switch(Driveroption) {
		case 1:
			launchBrowser();
		    break;
		case 2:
			launchBrowser1();
			break;
		}
	
	
	}
	
	public void initWebElements() {
		PageFactory.initElements(Common_Step_Definition.driver,AmazonPageobjects.getInstance());
		
	}
	 
	public void takeScrshot() throws Exception {
		File scrshot=((TakesScreenshot) Common_Step_Definition.driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(scrshot, new File(Common_Step_Definition.getScenarioName()+".png"));
	
	}
	public void AfterScenario() {
		Common_Step_Definition.driver.quit();
		System.out.println("Browser Closed Successfully");
	}
	
	public void highLightElement(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) Common_Step_Definition.driver;
		executor.executeScript("arguments[0].setAttribute('style', 'border: 6px solid blue');", element);
	}
	
	public void launchUrl(String url) {
		Common_Step_Definition.driver.get(url);
	}
	
}
	
