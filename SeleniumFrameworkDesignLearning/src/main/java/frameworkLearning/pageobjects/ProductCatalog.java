package frameworkLearning.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framworkLearning.AbstractComponents.AbstractComponents;

public class ProductCatalog extends AbstractComponents{

	WebDriver driver;
	
	public ProductCatalog(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath="//div[contains(@class,'mb-3')]")
	List<WebElement> products;
	
	@FindBy(css = ".ng-animating")
	WebElement spinner;
	
	By pageLoad=By.xpath("//div[contains(@class,'mb-3')]");
	By addCart= By.xpath("//button[contains(text(),'Add To Cart')]");
	By cartMessage=By.xpath("//div[@id='toast-container']");
	
	public List<WebElement> getProductList(){
		
		findElementToVisible(pageLoad);
		return products;		
	}
	
	public WebElement getProductByName(String productName) {
		
		WebElement prod=products.stream().filter(product->product.findElement(By.xpath("//h5/b")).getText()
				.equalsIgnoreCase(productName)).findFirst().orElse(null);
		return prod;
		
	}
	
	public void addProductToCart(String proName) {
	WebElement pro = getProductByName(proName);
	pro.findElement(addCart).click();
	findElementToVisible(cartMessage);
	//findElementToInvisible(spinner);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
