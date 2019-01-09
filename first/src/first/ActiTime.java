package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void actidemo() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//homepage title
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	String expectedtitle="actiTIME - Login";
	Assert.assertEquals(actualtitle, expectedtitle);
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("test case1 is pass");
	}
	else
	{
		System.out.println("test case1 is failed");
	}
    driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(5000);
	
	//loginpagetitle
	String act = driver.getTitle();
	String ect="actiTIME - Enter Time-Track";
	System.out.println(act);
	Assert.assertEquals(act, ect);
	if(act.equals(ect))
	{
		System.out.println("test case2 pass");
	}
	else
	{
		System.out.println("test case2 fail");
	}
	driver.close();
}
}
