package appiumproject;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MenuButtons {
	
	@Test
	public void hello() throws IOException, InterruptedException{
		 DesiredCapabilities capabiliti=new DesiredCapabilities();
		 
	     capabiliti.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	  
	     capabiliti.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	     capabiliti.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

	    capabiliti.setCapability(MobileCapabilityType.APP_PACKAGE, "com.learning6.menubuttons");
	    capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.learning6.menubuttons.MainActivity");
	
	    AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabiliti);
	    
	    System.out.println("The app is opened");
	    
	    // click on the button
	    driver.findElementById("com.learning6.menubuttons:id/buttonApple").click();
	    
	    driver.findElementById("com.learning6.menubuttons:id/button").click();
	    
	    driver.findElementByClassName("android.widget.ImageView").click();
	    
	    driver.findElementById("com.learning6.menubuttons:id/radio").click();
	    
	    driver.findElementById("com.learning6.menubuttons:id/TextGiven").clear();
	    Thread.sleep(500);
	    driver.findElementById("com.learning6.menubuttons:id/TextGiven").sendKeys("Rahul");
	    Thread.sleep(500);
	    //driver.findElementByXPath("Button:go to sign[126,455][353,534]").click();
	    driver.findElementById("com.learning6.menubuttons:id/fab").click();
	    Thread.sleep(500);
	    driver.findElementById("com.learning6.menubuttons:id/buttonApple").click();
	    
	  //android.widget.Button[@text='5']"
	    
	    
	
	

}
}
