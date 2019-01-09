package first;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BlunestoneScenario3 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pendent=driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[text()='Pendants ']"));
		Actions action=new Actions(driver);
		action.moveToElement(pendent).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul/li/span[@data-p='pendants-10k15k,m']")).click();	
		List<WebElement> cp=driver.findElements(By.xpath("//div[@class='clearfix']//span[@class='new-price']"));
		List<Integer> newprice=new ArrayList<Integer>();
		for(WebElement Cost:cp)
		{
			String pendentprice=Cost.getText().replaceAll("RS.", "").replaceAll(",", "").replaceAll(" ", "");
			System.out.println(pendentprice);



			int intvalue=Integer.parseInt(pendentprice);

			newprice.add(intvalue);
		}
		for(int revisedprice:newprice)
		{
			if(revisedprice>10000&&revisedprice<15000)
			{
			System.out.println(revisedprice+"cost is greater than 10000 and below 15000");
			}
			else
			{
			System.out.println(revisedprice+"cost is below 10000");
			}
		}


	}



}






