package frameworkLearning;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;
import frameworkLearning.BaseComponents.BaseTest;
import frameworkLearning.pageobjects.LandingPage;
import frameworkLearning.pageobjects.ProductCatalog;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerecCode2 extends BaseTest{

	String url="https://rahulshettyacademy.com/client";
	@Test(dataProvider="testData")
	public void submitOrder(String email,String password, String neededItem) throws IOException {
		
		LandingPage landpage=	launchApplication(url);
		ProductCatalog prodCatalog=landpage.login(email, password);
		List<WebElement>proList=prodCatalog.getProductList();
		prodCatalog.addProductToCart(neededItem);
		prodCatalog.goToCart();
		
		
	}
	
	@DataProvider
	public Object[][] testData() {
		
		Object[][] data =new Object[][] {{"indu@demo.com","Test@123","zara coat 3"}};
		return data;
	}

}
