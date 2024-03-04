package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// add 5 vegetable to cart
public class ProductsToCart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int count=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] itemsNeeded= {"Brocolli", "Beetroot", "Carrot", "Potato", "Tomato"};
		
		
		List<WebElement> items=driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<String>itemsNeededList=Arrays.asList(itemsNeeded);
		
		for(int i=0;i<items.size();i++) {
			
			String[] item= items.get(i).getText().split("-");
			String formattedItem=item[0].trim();
			
					
			if(itemsNeededList.contains(formattedItem)) {
				
				count++;
			  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			  
			  if(count==itemsNeeded.length) {
				  break;
			  }
			}
			
			
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	

	}

}
