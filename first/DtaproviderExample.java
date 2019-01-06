package first;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DtaproviderExample {

	@DataProvider
	public String[][] getData()
	{
		String[][] str=new String[2][2];
		str[0][0]="user1";
		str[0][1]="pass1";
		str[1][0]="user2";
		str[1][1]="pass2";
		
		return str;
	}
	@Test(dataProvider="getData")
	public void createUser(String uname,String Pass)
	{
		Reporter.log(uname+" "+Pass);
	}

}
