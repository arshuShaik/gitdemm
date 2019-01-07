package first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class pro2 {
	
	@BeforeMethod
	public void BM() {
		System.out.println("Running before method");
	}
	@Test
	public void test1() {
		System.out.println("Running test1");
	}
	@AfterMethod
	public void AM() {
		System.out.println("Running after method");
	}
	
	@Test
	public void test2() {
		System.out.println("Running test2");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("Running before class");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("Running after class");
	}
	@BeforeSuite
	public void BS() {
		System.out.println("Running before suite");
	}
	@AfterSuite
	public void AS() {
		System.out.println("Running after suite");
	}

}
