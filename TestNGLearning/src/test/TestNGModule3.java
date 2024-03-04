package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGModule3 {

	@AfterTest
	public void afterTest() {
		System.out.println("I will execute at the end of Test folder");
	}
	
	@Test
	public void tescaseOne() {
		System.out.println("from module3_1st test case");
	}
	
	@Test(groups = {"Smoke"})
	public void tescaseTwo() {
		System.out.println("from module3_2nd test case");
	}
}
