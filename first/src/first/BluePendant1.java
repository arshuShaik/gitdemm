package first;import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BluePendant1{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[text()='Pendants ']"));
		Actions action=new Actions(driver);
		action.moveToElement(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul/li/span[@data-p='pendants-below10k,m']")).click();	
		List<WebElement> cost=driver.findElements(By.xpath("//div[@class='clearfix']//span[@class='new-price']"));
		List<Integer> newcostList=new ArrayList<Integer>();
		for(WebElement Cost:cost)
		{
			String pendentcost=Cost.getText().replaceAll("RS.", "").replaceAll(",", "").replaceAll(" ", "");
			System.out.println(pendentcost);



			int intvalue=Integer.parseInt(pendentcost);

			newcostList.add(intvalue);
		}
		for(int totalcost:newcostList)
		{
			if(totalcost>10000)
			{
			System.out.println(totalcost+" Prive is greater than 10000");
			}
			else
			{
			System.out.println(totalcost+" price is below 10000");
			}
		}
		driver.close();

	}

}


