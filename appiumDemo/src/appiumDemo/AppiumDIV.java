package appiumDemo;

import java.text.DecimalFormat;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.sun.jna.platform.win32.OaIdl.DECIMAL;

public class AppiumDIV extends AppiumMUL{
	
	final static Logger logger = Logger.getLogger(AppiumMUL.class);
	
	public void divNumbers()
	{
		try{
	String Divres;
	driver.findElement(By.id(Constant.SUMDIGIT1)).click();
	driver.findElement(By.id(Constant.SUMOPDIV)).click();
	driver.findElement(By.id(Constant.SUMDIGIT2)).click();
	driver.findElement(By.id(Constant.SUMOPEQUAL)).click();
	//driver.findElement(By.id(Constant.SUMOPEQUAL)).click();
	Divres=driver.findElement(By.className(Constant.CALCDISPLAY)).getText();
	System.out.println("Result is:"+ Divres);
	assert Divres.equals("1 point 5");
	logger.info("Division Passed");
	driver.findElement(By.id(Constant.CALCDISPLAYCLEAR)).click();
		}catch (Exception e){
			logger.info("Division Failed");
			

		}
}}



