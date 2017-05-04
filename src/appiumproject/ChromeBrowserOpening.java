package appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
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
        cp.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        //now set the android driver for running the script
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cp);
         //now get the page required by getURL
          System.out.println("openng the crome");
         // Thread.sleep(3000);
          driver.sendKeyEvent(AndroidKeyCode.BACK);
          driver.sendKeyEvent(AndroidKeyCode.HOME);
          driver.sendKeyEvent(AndroidKeyCode.SETTINGS);
          
          Dimension size = driver.manage().window().getSize();
          System.out.println(size);
          int startx = (int) (size.width * 0.70);
          int endx = (int) (size.width * 0.30);
          int starty = size.height / 2;
          driver.swipe(startx, starty, endx, starty, 2000); // it swipes from right to left
          driver.swipe(endx, starty, startx, starty, 2000);
          
          
          
         // driver.getScreenshotAs(outputType<"app.jpg">"");
         // driver.get("http://www.google.com");
          Thread.sleep(2000);
         // driver.sendKeyEvent(AndroidKeyCode.MENU);
         //driver.swipe(0, 0, 500, 500, 200);
       // System.out.println(driver.getTitle());
          System.out.println("openng the crome");
          
         /* MobileElement ele=(MobileElement)driver.findElementByLinkText("Skype");
          
          ele.swipe(SwipeElementDirection.LEFT, 200);
          
          ele.swipe(SwipeElementDirection.RIGHT, 400); */
                
		
		

	}

}
