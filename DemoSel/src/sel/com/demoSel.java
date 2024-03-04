package sel.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoSel {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//waiting for the elements to appear on the screen
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); //find element by Id
		driver.findElement(By.name("inputPassword")).sendKeys("Input123");//find element by name
		driver.findElement(By.cssSelector("button.submit")).click();//CSS selector (tagname.classname)
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//css selector(tagname.classname)
		
		driver.findElement(By.linkText("Forgot your password?")).click();// using links
		
		Thread.sleep(5000);//Since in Single window applications, locators maynot be located as selenium is running fast. So we need to make it wait for some time
				
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("indu");//Xpath general format
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("indu@abc.com");//CSS selector general format
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//Xpath using index if more than one attributes having same value
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("indu@gmail.com");//css selector using names when more thgan one attribute having same value
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("986756789089");//xpath using tags moving from parent to child
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();//css selector- .classname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//css selector tags moving from parent to child 
	    
		//driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();//Xpath general syntax
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();//xpath using tag traversing. general syntax & indexing
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul"); //CSS selector using tagname#classname
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//css selector using regular expression
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();
		
		System.out.println(driver.getTitle());
		
		
		
		//driver.close();
		
		
		
		
	}

}
