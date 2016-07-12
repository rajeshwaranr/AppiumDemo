package appiumDemo;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;

public class AppiumSUM extends ConfigAppium{
	
	final static Logger logger = Logger.getLogger(AppiumSUM.class);
	public void addNumbers()
	{		
		try{
		String resAdd;
		driver.findElement(By.id(Constant.SUMDIGIT1)).click();
		driver.findElement(By.id(Constant.SUMOPPLUS)).click();
		driver.findElement(By.id(Constant.SUMDIGIT2)).click();
		driver.findElement(By.id(Constant.SUMOPEQUAL)).click();
		resAdd = driver.findElement(By.className(Constant.CALCDISPLAY)).getText();
		System.out.println("Result is:"+ resAdd);
		assert resAdd.equals("15");
		logger.info("Addition Passed");
		driver.findElement(By.id(Constant.CALCDISPLAYCLEAR)).click();
		}
		catch (Exception e)
		{
			logger.info("Addition Failed");
		}
		
	
		
	}

}
