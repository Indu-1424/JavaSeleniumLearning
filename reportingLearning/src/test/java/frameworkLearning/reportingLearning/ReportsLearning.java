package frameworkLearning.reportingLearning;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportsLearning {

	ExtentReports rep;
	
	@Test
	public void loginApplication() {
		rep.createTest("Login Functionality");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("indu@demo.com");
		driver.findElement(By.id("userPassword")).sendKeys("Test@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//button/i[@class='fa fa-sign-out']"));
		driver.close();
		rep.flush();
	}
	
	@BeforeTest
	public void addReport() {
		
		String filePath=System.getProperty("user.dir")+"\\reports\\index.html";
	    ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
	    reporter.config().setReportName("Web Automation Learning");
	    reporter.config().setDocumentTitle("Test Results");
	    
	    rep = new ExtentReports();
	    rep.attachReporter(reporter);
	    rep.setSystemInfo("Tester", "Indu");
	
	}

}
