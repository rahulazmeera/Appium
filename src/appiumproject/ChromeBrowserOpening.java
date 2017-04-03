package appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class ChromeBrowserOpening {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
	 //Set Desired Capailities 
		DesiredCapabilities cp=new DesiredCapabilities();
		//NOw set Capabilities of the Mobile Platform
		
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		//Now Set capability for device type
        cp.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        //now set capability for the type of browser to open 
        cp.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //now give time for the driver to get invoked
        cp.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "600");
        //now set the android driver for running the script
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cp);
         //now get the page required by getURL
          //System.out.println("openng the crome");
          //Thread.sleep(3000);
          driver.get("http://www.google.com");
          Thread.sleep(2000);
          driver.sendKeyEvent(AndroidKeyCode.MENU);
         
       // System.out.println(driver.getTitle());
          System.out.println("openng the crome");
          
                
		
		

	}

}
