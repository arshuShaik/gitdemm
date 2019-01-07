package first;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Assign4 {
		static {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bluestone.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			Thread.sleep(1000);
			Actions action=new Actions(driver);
			WebElement alljew = driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul//a[contains(text(),'Pendants')]"));
			action.moveToElement(alljew).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Below 10,000'and @data-p='pendants-below10k,m']")).click();
			
			List<WebElement> price_list = driver.findElements(By.xpath("//span[@class='new-price']"));
			int pri=0;
			for(int i=0;i<price_list.size();i++)
			{
			String price=price_list.get(i).getText();
			String price_new=price.replaceAll("RS. ", "").replaceAll(",", "");
			System.out.println(price_new);
			 pri=Integer.parseInt(price_new);
			}
			if(pri<10000)
			{
				System.out.println("price is below 10,000");
			}
			
			else
			{
				System.out.println("price is above 10,000");
			}
	}
	}


