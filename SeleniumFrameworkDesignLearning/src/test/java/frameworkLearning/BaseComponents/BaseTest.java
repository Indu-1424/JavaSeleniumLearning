package frameworkLearning.BaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworkLearning.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	
	public WebDriver driverInitialization() throws IOException {
		
		//initializing Properties class to call the global data
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\frameworkLearning\\Resources\\GlobalData.properties");
		prop.load(fis);//for loading the properties file created inside the folder
		String browserValue= prop.getProperty("browser");
		if(browserValue.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browserValue.equalsIgnoreCase("edge")) {
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	public LandingPage launchApplication(String url) throws IOException {
		LandingPage landPage=new LandingPage(driverInitialization());		
		landPage.loadURL(url);
		return landPage;
	}

}
