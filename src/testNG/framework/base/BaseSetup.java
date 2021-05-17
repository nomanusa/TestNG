package testNG.framework.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSetup {
	
	WebDriver driver=null;
	public static Properties prop;
	
	@BeforeClass
	public void propLoad() throws IOException 
	{
		prop=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"./src/main/java/org/config/h2k/config.Properties");
		prop.load(file);
	}
	
	public WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromePath"));
		
		   driver=new ChromeDriver();
		  
		   driver.get("https://www.amazon.com/");
		   
		   driver.manage().window().maximize();
		  
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		  
		  return driver;
		  
		 
	}
	@AfterClass
	     public void teardown()
	{
		 driver.close();
	}
    
    }
