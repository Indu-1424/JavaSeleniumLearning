package framworkLearning.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	
	WebDriver driver;
	
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void findElementToVisible(By loc) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	
	public void findElementToInvisible(WebElement spin) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.invisibilityOf(spin));
	}

	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement cart;
	
	public void goToCart() {
		cart.click();
	}

}
