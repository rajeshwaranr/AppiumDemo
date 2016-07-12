package appiumDemo;
import java.net.MalformedURLException; 
import java.net.URL; 
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.remote.CapabilityType; 
import org.openqa.selenium.remote.DesiredCapabilities; 
import org.openqa.selenium.remote.RemoteWebDriver; 
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test;
import appiumDemo.Constant;

import appiumDemo.ConfigAppium;

public class AppiumSUB extends AppiumSUM{
	
	final static Logger logger = Logger.getLogger(AppiumSUB.class);
	public void subtractNumbers()
	{
		try
		{
		String Subres;
		driver.findElement(By.id(Constant.SUMDIGIT1)).click();
		driver.findElement(By.id(Constant.SUMOPMINUS)).click();
		driver.findElement(By.id(Constant.SUMDIGIT2)).click();
		driver.findElement(By.id(Constant.SUMOPEQUAL)).click();
		Subres = driver.findElement(By.className(Constant.CALCDISPLAY)).getText();
		System.out.println("Result is:"+ Subres);
		int val = Integer.parseInt(Subres);
		assert Subres.equals(val);
		logger.info("Subtraction Passed");
		driver.findElement(By.id(Constant.CALCDISPLAYCLEAR)).click();
	}
		catch (Exception e){
			logger.info("Subtraction failed");
		}}

}
