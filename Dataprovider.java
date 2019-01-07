package first;

import org.testng.annotations.Test;

public class Dataprovider
{
@Test(dataProvider="testdata",dataProviderClass=Datap.class)
	public void test1(String un,String pw)
	{
		System.out.println(un);
		System.out.println(pw);
	}
}

