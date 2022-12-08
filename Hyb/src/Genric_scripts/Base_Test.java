package Genric_scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constants{
public WebDriver driver;
@BeforeMethod
public void openApp()
{
	System.setProperty(gecko_key, gecko_value);
	System.setProperty(chrome_key, chrome_value);
	driver=new FirefoxDriver();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
}
@AfterMethod
public void closeApp(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		Generic_TS.getPhoto(driver);
	}
driver.close();	
}
}
