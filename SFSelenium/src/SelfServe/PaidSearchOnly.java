package SelfServe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;

public class PaidSearchOnly {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://beta-selfserve.azurewebsites.net/Login");
		driver.findElement(By.id("login")).sendKeys("22-1142");
		driver.findElement(By.id("loginSubmitBtn")).click();
		System.out.println(driver.findElement(By.tagName("Strong")).getText());
		if(driver.findElement(By.xpath("//h3/input[@value='Paid Search Program']")).isDisplayed()) {
			
			enrollPaidSearch(driver);
			
		}else {
			System.out.println("Agent already enrolled in Paid Search Program");
		}
			

	}
	
	public static void enrollPaidSearch(WebDriver driver) {
		driver.findElement(By.xpath("//h3/input[@value='Paid Search Program']")).click();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),\"Please review \")]")).getText());
		driver.findElement(By.xpath("//a[@id='continue-button']")).click();
		String title =driver.findElement(By.xpath("//h4[contains(text(),'Complete')]")).getText();
		
	}
 

}
