package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginValidation {
	static {
		System.setProperty("webdriver.chome.driver", "./driver/chromedriver.exe");
	}	
		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com");
			String title = "actiTIME - Login";
			String str = driver.getTitle();
			//System.out.println(str);
			try {
			Assert.assertEquals(str, title);
			if(str.equals(title)) {
				Reporter.log("test case 1 step 1 pass", true);
			}
			}catch(AssertionError e){
				Reporter.log("Test case 1 step 1 fail", true);
				e.getMessage();
			}

			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			String expUrl = "user";
			//System.out.println(url);
			try {
				Assert.assertTrue(url.contains(expUrl));;
				if(url.contains(expUrl)) {
					Reporter.log("test case 1 step 2 pass", true);
				}
				}catch(AssertionError e){
					Reporter.log("Test case 1 step 2 fail", true);
					e.getMessage();
				}
			driver.close();
	}

}
