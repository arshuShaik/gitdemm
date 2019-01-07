package first;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Prg3{
	
	@Test
	public void Login() {
		System.out.println("Login Running");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="Login")
	public void Logout() {
		System.out.println("Logout Running");
	}
	@Test
	@Ignore
	public void Run() {
		System.out.println("Run Running");
	}

}


