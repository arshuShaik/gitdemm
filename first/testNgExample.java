package first;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgExample {
	
		@Test(invocationCount=4)
		public void sendMessage()
		{
		Reporter.log("Message has been sent succesfully",true);
		}
		@BeforeMethod
		public void login1()
		{
			Reporter.log("Login Successfull",true);
		}
		@AfterMethod(dependsOnMethods="login1")
		public void logout()
		{
			Reporter.log("Logout completed",true);
		}
		@Test(priority=2)
		public void message()
		{
			Reporter.log("message is sent to user 2",true);
		}
		@BeforeTest()
		public void createuser()
		{
			Reporter.log("User has been create successfully",true);
		}
		@AfterTest
		public void close()
		{
			Reporter.log("Succesfully tested scenario of sending the message",true);
		}
		@BeforeSuite
		public void openBrowser()
		{
			Reporter.log("Browser is opened to test the application",true);
		}
		@AfterSuite
		public void CloseBrowser()
		{
			Reporter.log("browser is closed after succesfull execution of the code",true);
		}
		@Test
		public void failTest()
		{
			Assert.fail();
		}
		

		
		
		

	
}
