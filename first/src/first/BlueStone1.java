package first;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BlueStone1 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   } 

 	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pendent=driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[text()='Pendants ']"));
		Actions act=new Actions(driver);
		act.moveToElement(pendent).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li/span[@data-p='pendants-10k15k,m']")).click();	
		List<WebElement> costOfPendent=driver.findElements(By.xpath("//div[@class='clearfix']//span[@class='new-price']"));
		List<Integer> costList=new ArrayList<Integer>();
		for(WebElement Cost:costOfPendent)
		{
			String pendentCost=Cost.getText().replaceAll("RS.", "").replaceAll(",", "").replaceAll(" ", "");
			System.out.println(pendentCost);
			int intvalue=Integer.parseInt(pendentCost);
			costList.add(intvalue);
		}
		for(int costList1:costList)
		{
			if(costList1>10000&&costList1<15000)
			{
			System.out.println(costList1+"Price is greater than 10000 and below 15000");
			}
			else
			{
			System.out.println(costList1+"price is below 10000");
			}
		}
	}
}


