package first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethod
{
@Test
public void login()
{
	System.out.println("running");
	Assert.assertTrue(false);
	
}
@Test(dependsOnMethods="login")
public void logout()
{
	System.out.println("running 2nd");
}
}
