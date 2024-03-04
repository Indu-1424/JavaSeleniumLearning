package frameworkLearning.pageobjects;

import org.openqa.selenium.WebDriver;

import framworkLearning.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents{
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	
	
}
