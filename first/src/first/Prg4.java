package first;
import org.testng.annotations.Test;

public class Prg4{
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Running test1...");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("Running test2.....");
	}

	@Test(invocationCount=3)
	public void test3() {
		System.out.println("Running test3.....");
	}
}


