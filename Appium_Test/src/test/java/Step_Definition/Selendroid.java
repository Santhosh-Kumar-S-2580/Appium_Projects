package Step_Definition;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Selendroid {
	public static AndroidDriver  driver;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// To Set the Desired Capabilities
				DesiredCapabilities cap= new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
				//cap.setCapability("automationName", "UiAutomator2");
				//cap.setCapability("automationName", "UiAutomator1");
				cap.setCapability(MobileCapabilityType.DEVICE_NAME,"motorola one macro");
				cap.setCapability(MobileCapabilityType.UDID, "ZF652253BB");
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
				cap.setCapability("appPackage", "com.google.android.calculator");
				cap.setCapability("appActivity", "com.android.calculator2.Calculator");
				

				// To specify the Appium Server
				URL url=new URL("http://0.0.0.0:4723/wd/hub");
				driver=new AndroidDriver(url,cap);
				System.out.println("Application Started Successfully....");
	}

}
