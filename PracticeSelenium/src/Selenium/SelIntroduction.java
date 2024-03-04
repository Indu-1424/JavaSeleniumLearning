package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
				
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://dacgroupbeta.crm.dynamics.com/main.aspx?appid=8ac5e88b-d4c2-ea11-a812-000d3a4daf27&forceUCI=1&pagetype=dashboard&id=2701de60-8f2a-48a4-8262-4a35ca7441fa&type=system&_canOverride=true");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		
		
	
		
	
		
	}

}
