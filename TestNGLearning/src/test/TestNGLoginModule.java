package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGLoginModule{
	@Parameters({"URL"})
	@Test
	public void loadPage(String url) {
		System.out.println(url);
	}
	
	
	@Test(dataProvider = "getData")
	public void loginFunction(String uname, String pass) {
		
		System.out.println("User Name : "+uname+" & Password: "+pass);
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] ="firstUserName";
		data[0][1] ="firstPassword";
		
		data[1][0] = "secondUserName";
		data[1][1] ="secondPassword";
		
		data[2][0] ="thirdUserName";
		data[2][1] ="thirdPassword";
		
		return data;
	}

}
