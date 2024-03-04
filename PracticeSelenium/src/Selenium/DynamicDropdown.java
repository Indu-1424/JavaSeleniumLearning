package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Dynamic dropdown for From & To using indexing

		driver.findElement(By.xpath("//div[@class='ad-row align-center']/input")).click();

		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='TRV'])[2]")).click(); // since both From & To dropdowns having same
																		// options- for the 2nd one we need to wrap the
																		// xpath & give index

		
		/*
		 * // Dynamic Dropdown locators using Parent Child relationships
		 * driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"
		 * )) .click(); driver.findElement(By.
		 * xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"
		 * )) .click();
		 * 
		 */

	}

}
