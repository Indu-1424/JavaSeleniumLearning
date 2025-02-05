package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Dropdowns with select tag - Static Dropdown
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);//selecting the dropdown by index value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
