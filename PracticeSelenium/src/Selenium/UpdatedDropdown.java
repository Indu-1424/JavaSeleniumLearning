package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(5000);
		
		while(!(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText().equalsIgnoreCase("4 Adult"))) {
			
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		}
		
	
		Thread.sleep(5000);
		
		while(!(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText().equalsIgnoreCase("4 Adult, 2 Child"))) {
			
			driver.findElement(By.xpath("//span[contains(@id,'hrefIncChd')]")).click();
		}
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@id,'divpaxinf')]")).getText());

		
		
	}

}
