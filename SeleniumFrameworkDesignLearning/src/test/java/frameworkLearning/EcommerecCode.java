package frameworkLearning;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerecCode {

	public static void main(String[] args) {
		
		String neededItem="zara coat 3";
		
		//using Webdriver manager directly we can invoke the Chromedriver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("indu@demo.com");
		driver.findElement(By.id("userPassword")).sendKeys("Test@123");
		driver.findElement(By.name("login")).click();
		//Collect all the elements on the List
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'mb-3')]")));
		
		List<WebElement>products = driver.findElements(By.xpath("//div[contains(@class,'mb-3')]"));
		
		WebElement prod=products.stream().filter(product->product.findElement(By.xpath("//h5/b")).getText()
				.equalsIgnoreCase(neededItem)).findFirst().orElse(null);
		
		prod.findElement(By.xpath("//button[contains(text(),'Add To Cart')]")).click();
		
		//Waiting for the message - Added to cart (Explicit wait)
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		
		//Collecting all the elements in the list
		List<WebElement> cartItems=driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
		Boolean match= cartItems.stream().anyMatch(item->item.getText().equalsIgnoreCase(neededItem));
			//assertEquals(true, match);
			//assertEquals(true, match);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		
		Actions act= new Actions(driver);
		act.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "India").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[contains(@class,'ta-results')]")));
		driver.findElement(By.xpath("//button[contains(@class,'ta-item')][2]")).click();
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBY(0,150)");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector(".action__submit")).click();
		String conf= driver.findElement(By.cssSelector(".hero-primary")).getText();
		assertTrue(conf.equalsIgnoreCase("Thankyou for the order."));
		
		
		
		
		
		
		
	}

}
