import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DigitalContentProgramOrderCreation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		/*
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		*/
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://qa.agenthoodprogramenrollment.com/Account/SignIn\r\n");
		System.out.println(driver.findElement(By.xpath("//div/h1[contains(text(),'Program Enrollment')]")).getText());
		driver.findElement(By.id("Email")).sendKeys("inair@dacgroup.com");
		driver.findElement(By.id("Password")).sendKeys("Sunil@1984");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//div[@id='side-navigation']/a[6]")).click();
		driver.findElement(By.id("SearchCriteria_TextValue1")).sendKeys("3P7RP3K4000");
		driver.findElement(By.xpath("//input[@id='SearchCriteria_TextValue1']")).click();
		String associate=driver.findElement(By.xpath("//table[@class='table table-hover text-nowrap no-last-row-border mb-0']/tbody//td[1]")).getText();

		if(associate.equalsIgnoreCase("3P7RP3K4000")) {
		
			driver.findElement(By.xpath("//table[@class='table table-hover text-nowrap no-last-row-border mb-0']/tbody//td[1]")).click();
		}
		

	}

}
