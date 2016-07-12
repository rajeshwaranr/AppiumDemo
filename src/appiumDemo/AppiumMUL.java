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

public class AppiumMUL extends AppiumSUB{
	
	final static Logger logger = Logger.getLogger(AppiumMUL.class);
	public void mulNumbers()
	{
		try{
	String Mulres;
	driver.findElement(By.id(Constant.SUMDIGIT1)).click();
	driver.findElement(By.id(Constant.SUMOPMUL)).click();
	driver.findElement(By.id(Constant.SUMDIGIT2)).click();
	driver.findElement(By.id(Constant.SUMOPEQUAL)).click();
	Mulres = driver.findElement(By.className(Constant.CALCDISPLAY)).getText();
	System.out.println("Result is:"+ Mulres);
	assert Mulres.equals("54");
	logger.info("Multiplication Passed");
	driver.findElement(By.id(Constant.CALCDISPLAYCLEAR)).click();
		}catch (Exception e){
			logger.info("Multiplication Failed");
		}
}}
