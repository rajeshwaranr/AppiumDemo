package appiumDemo;
import java.net.MalformedURLException; 
import java.net.URL; 
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType; 
import org.openqa.selenium.remote.DesiredCapabilities; 
import org.openqa.selenium.remote.RemoteWebDriver; 
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 
import appiumDemo.AppiumSUM;

public class ConfigAppium {
	
	static WebDriver driver;
	
	@BeforeTest
	
		public void setUp() throws MalformedURLException 
		{
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("deviceName", "avd1");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability(CapabilityType.VERSION, "4.4.4");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.calculator2"); 
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
		@Test
		public void launchCalc()
		{			
			System.out.println("************************App launched****************************");
			AppiumSUM sm = new AppiumSUM();
			AppiumSUB sb = new AppiumSUB();
			AppiumMUL sl = new AppiumMUL();
			AppiumDIV sd = new AppiumDIV();
			
			sm.addNumbers();
			sb.subtractNumbers();
			sl.mulNumbers();
			sd.divNumbers();
		}
		
		@AfterTest
		public void testOver()
		{
			driver.quit();
		}

	}