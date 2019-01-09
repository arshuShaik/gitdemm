package first;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCondition {

	@Test
	public void createUser() {
		Reporter.log("createuser",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="createUser")
	public void deleteUser() {
		Reporter.log("deleteuser",true);
	}
	
}
