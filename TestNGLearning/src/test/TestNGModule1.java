package test;


import org.testng.annotations.Test;

public class TestNGModule1 {
		
	@Test
	public void testCaseOne() {
		
		System.out.println("from Module1_1st Test Case");
	}

	@Test
	public void testCaseTwo() {
		
		System.out.println("from Module1_2nd Test Case");
	}
	
	@Test(groups = {"Smoke"})
    public void testCaseThree() {
		
		System.out.println("from Module1_3rd Test Case");
	}
	
	

}
