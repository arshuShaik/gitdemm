package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void testA(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
			driver=new ChromeDriver();
		}
		else
			System.setProperty(" ", " ");
			driver=new FirefoxDriver();
		
	}
	
}
