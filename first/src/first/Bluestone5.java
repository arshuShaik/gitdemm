
	package first;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Bluestone5 
	{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		boolean flag=false;
		WebDriverWait wait=new WebDriverWait(driver,10);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		WebElement p=driver.findElement(By.xpath("//a[text()='Pendants ']"));
		Actions actn=new Actions(driver);
		actn.moveToElement(p).perform();
		
		driver.findElement(By.xpath("//span[text()='Between 10k-15k']")).click();
		
		List<WebElement> price=driver.findElements(By.xpath("//span[@class='b-price-wrapper']/span/span"));
		for(int i=0;i<price.size();i++)
		{
			price.get(i).click();
			wait.until(ExpectedConditions.titleContains("The"));
			WebElement value=driver.findElement(By.xpath("//span[@id='our_price_display']"));
			String txt=value.getText();
			int v=txt.charAt(0);
			int val=v+txt.charAt(1);
			if(val<10)
			{
				flag=true;
			}
			driver.navigate().back();
		}
		if(flag==false)
		{
			System.out.println("all price are less than 10,000");
		}
		else
		{
			System.out.println("all price are more than 10,000");
		}
		driver.close();
		
	}
	}

