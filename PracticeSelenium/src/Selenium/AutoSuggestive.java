package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
	for(WebElement option:options) {
		
		if(option.getText().equalsIgnoreCase("INDIA")) {
			option.click();
			break;
		}
	}
			
		
	
	}

}
