package appiumproject;

import java.awt.List;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class appium {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	@Test
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		          File appDir=new File("src");
		          File app=new File(appDir, "BookMyShow–Movie Tickets Plays_v4.4.5_apkpure.com.apk");
		 
		          DesiredCapabilities capabiliti=new DesiredCapabilities();
		 
		          capabiliti.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		 
		          capabiliti.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		          capabiliti.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		 
		          capabiliti.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		          AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabiliti);
              System.out.print("heeo");
		          /* //driver.findElementById("com.bt.bms:id/btnLogin").click();
		          driver.findElementByLinkText("Login").click();
		          //to know is the phone locked or not
		          System.out.println(driver.isLocked());
		          //to Know which type of app NATIVE app of Web app
		          System.out.println(driver.getContext());
		          //to close app 
		          driver.closeApp();
		          //to know current activity
		          driver.currentActivity();
		          //to zoom on particular element
		          //driver.zoom(Element);
		          //to perform touch action on the app
		          TouchAction ac=new TouchAction(driver);
		          //you should give .perform after the tap on certain index or elemnt
		          //ac.tap(el).perform();
		          
		          //Example code
		          java.util.List<WebElement> abc=driver.findElementsById("");
		          //Native Events // tappings, Long Press,  
		          TouchAction a=new TouchAction(driver);
		          //to perform the actions on particular index of the element 
		          a.tap(abc.get(2)).perform(); 
		          
		          
		          
		          */
		          
		          
	}

}
