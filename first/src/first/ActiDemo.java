package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void actidemo() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//Home page
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	String expectedtitle="actiTIME - Login";
	Assert.assertEquals(actualtitle, expectedtitle);
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("title1 pass");
	}
	else
		System.out.println("title1 fail");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(5000);
	
	//loginpage
	String actual2 = driver.getTitle();
	String expected2="actiTIME - Enter Time-Track";
	System.out.println(actual2);
	Assert.assertEquals(actual2, expected2);
	if(actual2.equals(expected2))
	{
		System.out.println("title2 pass");
	}
	else
		System.out.println("title2 fail");
	driver.close();
}
}

  

