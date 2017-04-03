package appiumproject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appium3 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		File appDir=new File("src");
        File app=new File(appDir, "sprint.apk");

        DesiredCapabilities capabiliti=new DesiredCapabilities();

        capabiliti.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

        capabiliti.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        capabiliti.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
        capabiliti.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabiliti);
		
        driver.findElementById("continue_button").click();
        
        System.out.println("Sign in page verification");
        driver.findElementById("userNameTextField").sendKeys("qqbrasslight22");
        driver.findElementById("passwordTextField").sendKeys("C2c0op46");
        driver.findElementById("loginButton").click();
        
        System.out.println("Sign in done sucessfully");
        
		
		
	}

}
