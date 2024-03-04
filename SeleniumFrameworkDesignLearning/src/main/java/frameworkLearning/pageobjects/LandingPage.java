package frameworkLearning.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framworkLearning.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='userEmail']")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement loginButton;
	
	
	public ProductCatalog login(String userEmail,String userPassword) {
		email.sendKeys(userEmail);  
		pass.sendKeys(userPassword);
		loginButton.click();
		ProductCatalog prodCatalog=new ProductCatalog(driver);
		return prodCatalog;
	}
	
	public void loadURL(String url) {
		driver.get(url);
	}
	

}
