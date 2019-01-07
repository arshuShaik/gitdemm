package first;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class BlueStone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

//	public static void main(String[] args) throws InterruptedException {
	  // @Test
		public void blustone() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		
		//get title
		String expectedtitle=driver.getTitle();
		System.out.println(expectedtitle);
		String actualtitle="Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2018 | BlueStone.com";
		//Assert.assertEquals(actualtitle, expectedtitle);
		
		WebElement alljew = driver.findElement(By.xpath("//li[@class='menuparent']"));
		Actions a=new Actions(driver);
		a.moveToElement(alljew).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Kadas']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='inner pd-gray-bg'])[1]")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("buy-now")).click();
	    
	    //get error msg
	    String actualerrmsg = driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText();
	    System.out.println(actualerrmsg);
	    String expectederrmsg="* This field is required";
	   // Assert.assertEquals(actualerrmsg, expectederrmsg);
	   //System.out.println(errmsg);
      driver.close();
	}

}
