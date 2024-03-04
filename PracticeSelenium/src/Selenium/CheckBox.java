package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).click();
		boolean value=driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).isSelected();// to check whether the checkbox is selected or not
		System.out.println(value);
			
		//Count the number of checkboxes in the page & the number of checkboxes which are selected
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		
		
	}

}
