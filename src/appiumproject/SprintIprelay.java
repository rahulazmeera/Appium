package appiumproject;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SprintIprelay {
	@Test
	public void launch() throws IOException, InterruptedException{
		 DesiredCapabilities capabiliti=new DesiredCapabilities();
		 
	     capabiliti.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	  
	     capabiliti.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	     capabiliti.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");

	     capabiliti.setCapability(MobileCapabilityType.APP_PACKAGE, "com.indeed.android.jobsearch");
	    capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.indeed.android.jobsearch.MainActivity");
	    
	     //capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.facebook,LoginActivity");
		    
	     AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabiliti);
	     
	     
	     

	     
	


}
}
