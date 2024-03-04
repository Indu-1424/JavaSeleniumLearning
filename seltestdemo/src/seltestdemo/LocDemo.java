package seltestdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // creating the object of chrome driver
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//Entered URL will open
		

		
	}

}
