package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class sample {
	WebDriver driver;

		// TODO Auto-generated method stub
	@DataProvider
	public String[][] getData()
	{
		
		String[][] str=new String[2][2];
		str[0][0]="habcd";
		str[0][1]="123345";
		//str[1][0]="user2";
		//str[1][1]="pass2";
		
		return str;
	}
		@BeforeSuite
		public void openBrowser()
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		}
		
		@BeforeMethod
		public void TestLoginTitle()
		{
		String Title=driver.getTitle();
		Assert.assertEquals("Log in to Facebook | Facebook", Title);
		}
		@Test(dataProvider="getData")
		public void Login(String username,String Password)
		{
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(Password);
			driver.findElement(By.id("loginbutton")).click();
		}
		@AfterMethod
		public void verifyHomePage()
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String Title2=driver.getTitle();
			Assert.assertEquals(" ", Title2);
			Reporter.log("Sucessfully executed the Code",true);
		}
		@AfterTest
		public void logout()
		{
			driver.findElement(By.id("userNavigationLabel")).click();
		}
		@AfterSuite
		public void closeBrowser()
		{
			driver.close();
		}
		

	

}
