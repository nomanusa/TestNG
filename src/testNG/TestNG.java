package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	public void method1()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noman\\Desktop\\QA Class\\Selenium\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.google.com/");
	
	}

}
