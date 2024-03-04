package sel.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://beta-coaching.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("22-7160");
		driver.findElement(By.id("loginSubmitBtn")).click();
	}

}
