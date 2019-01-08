package first;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SonyScenario1 {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public static void addProduct()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Properties product=null;
	try
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 product = new Properties();
		product.load(new FileInputStream("./product.properties"));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
	driver.findElement(By.xpath("//input[contains(@title,'Search for products')]")).sendKeys(product.getProperty("product"),Keys.ENTER);
	List<WebElement> eles = driver.findElements(By.xpath("//div[@class='bhgxx2 col-12-12']/div[not(contains(@class,'_1YuAuf'))]"));
	for(WebElement i:eles)
	{
		WebElement ostock = driver.findElement(By.xpath("//div/span[contains(.,'Out Of Stock')]"));
		
		
	}
	
	
	//driver.close();
	
}
}
