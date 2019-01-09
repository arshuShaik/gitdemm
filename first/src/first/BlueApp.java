package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueApp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.bluestone.com");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.switchTo().frame("livechat-compact-view");
	     
	     //Actions action=new Actions(driver);
	     WebElement ele = driver.findElement(By.id("open-label"));
	     ele.click();
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("livechat-full-view");
	     Thread.sleep(2000);
	     driver.findElement(By.id("name")).sendKeys("disha");
	     driver.findElement(By.id("email")).sendKeys("dishashankar14@gmail.com");
	     driver.findElement(By.xpath("//input[contains(@id,'container')]")).sendKeys("9035177134");
	     driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
	     Thread.sleep(2000);
	     String msg = driver.findElement(By.xpath("//span[@class='msg-text']")).getText();
	     System.out.println(msg);
	     driver.close();
	     
	     
	    
	}

}
