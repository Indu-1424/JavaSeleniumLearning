package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGModule2 {

	@Test(groups = {"Smoke"})
	public void testCaseOne() {
		System.out.println("from Module2_ 1st test case");
	}
	
	@Test(enabled = false)
	public void mobileFunctTest() {
		System.out.println("from Module2_ mobile functionality");
	}
	
	@Test(groups = {"Smoke"})
	public void mobileUITest() {
		System.out.println("from Module2_ mobile UI");
	}
	
	@Test(dependsOnMethods = {"testCaseOne"})
	public void mobileAPI() {
		System.out.println("from Module2_ MobileAPI");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I will execute at start of Test folder");
	}
}
