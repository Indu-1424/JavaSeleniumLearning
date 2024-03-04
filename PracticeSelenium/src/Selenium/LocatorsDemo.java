package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		//Setting the location of the chomedriver downloaded location 
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // creating the object of chrome driver
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Implicitly waiting for 5 second for inspecting all the elements
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//Entered URL will open
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Input123");
		driver.findElement(By.cssSelector("button.submit")).click();
		
		//System.out.println(driver.findElement(By.className("error")));
		
		

	}

}
