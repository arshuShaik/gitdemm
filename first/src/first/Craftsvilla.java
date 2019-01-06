package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import generic.Utility;

public class Craftsvilla {
	public static final String CONFIG_PATH="./config2.properties";
	public static String username=Utility.getPropertyValu(CONFIG_PATH, "USERNAME");
	public static String userblank=Utility.getPropertyValu(CONFIG_PATH, "USERBLANK");
	public static String errormsg=Utility.getPropertyValu(CONFIG_PATH, "ERRORMSG");
	public static String blankun=Utility.getPropertyValu(CONFIG_PATH, "BLANKUn");

	public static String error=Utility.getPropertyValu(CONFIG_PATH, "ERRORMSG");


	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) throws InterruptedException 
	{

	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.craftsvilla.com");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//button[@type='button']")).click();
	driver.findElement(By.xpath("//span[.='Sign In']")).click();
	driver.findElement(By.id("emailId")).sendKeys(username);
	driver.findElement(By.xpath("//div[@id='continueBtn']")).click();
	WebElement ele1 = driver.findElement(By.xpath("//div[@class='error-msg']"));
	String aerrormsg = ele1.getText();
	String eerrormsg = error;
	SoftAssert s=new SoftAssert();
	s.assertEquals(aerrormsg, eerrormsg);
	s.assertAll();
	
	
	driver.findElement(By.id("emailId")).clear();
	Thread.sleep(3000);
	driver.findElement(By.id("emailId")).sendKeys(userblank);
	driver.findElement(By.xpath("//div[@id='continueBtn']")).click();
	WebElement ele2 = driver.findElement(By.xpath("//div[@class='error-msg']"));
	String aerrormsg2 = ele2.getText();
	String eerrormsg2=blankun;
	s.assertEquals(aerrormsg2, eerrormsg2);
	
	
	
	
	}

}
