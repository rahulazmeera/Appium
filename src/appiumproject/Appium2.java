package appiumproject;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appium2 {
	@Test
	public void hello() throws IOException, InterruptedException{
	 DesiredCapabilities capabiliti=new DesiredCapabilities();
	 
     capabiliti.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
  
     capabiliti.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
     capabiliti.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

    // capabiliti.setCapability(MobileCapabilityType.APP_PACKAGE, "com.indeed.android.jobsearch");
    // capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.indeed.android.jobsearch.MainActivity");

     capabiliti.setCapability(MobileCapabilityType.APP_PACKAGE, "com.sprint.care");
     capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.sprint.app.ui.home.HomeActivity");
     
     
     //capabiliti.setCapability(MobileCapabilityType.APP_PACKAGE, "com.leihwelt.android.hc.notes");
     //capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.leihwelt.android.hc.notes.Notes");
     AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabiliti);
      //driver.findElementById("com.bt.bms:id/btnLogin").click();
          //System.out.println(driver.getContext());
       //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //capabiliti.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
      System.out.println("Capturing the snapshot of the page ");
     
      System.out.println("Capturing the snapshot of the page ");
      System.out.println("Capturing the snapshot of the page ");
      
      //Thread.sleep(000);
      //driver.findElementById("com.squareup.cash:id/sms_number").sendKeys("1234");
     // System.out.println(driver.findElementByClassName("android.widget.TextView").getText());
  	 //File srcFiler=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	 //FileUtils.copyFile(srcFiler, new File("/home/rahul/Desktop/UntitledFolder/a.png"));
      
      //driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
     // driver.findElementByClassName("android.widget.Button").click();
    //  driver.findElementById("continue_button").click(); 
     // driver.findElementByName("Continue").click();
      System.out.println("Sign in page verification");
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      driver.findElementByClassName("android.widget.ImageView").click();
     
      System.out.println("clciked on sign in button sucesfully");
      
      driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sprint.care.beta:id/title\")").click();
      driver.findElementById("userNameTextField").sendKeys("qqbrasslight22");
      driver.findElementById("passwordTextField").sendKeys("C2c0op46");
      driver.findElementById("loginButton").click();
      
      System.out.println("Sign in done sucessfully");
      
      
      
      
	
	}
	
	
	
}
