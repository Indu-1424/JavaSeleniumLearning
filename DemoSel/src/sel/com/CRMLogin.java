package sel.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Important downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://dacgroupbeta.crm.dynamics.com/main.aspx?appid=8ac5e88b-d4c2-ea11-a812-000d3a4daf27&forceUCI=1&pagetype=dashboard&id=2701de60-8f2a-48a4-8262-4a35ca7441fa&type=system&_canOverride=true");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("i0116")).sendKeys("inair@dacgroup.com");
		driver.findElement(By.cssSelector("input#i0116")).sendKeys("inair@dacgroup.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("Ambu@1988");
		//driver.findElement(By.id("idSIButton9")).click();
		//driver.findElement(By.cssSelector("input#idSIButton9")).click();
		Thread.sleep(5000);
		
		for(int i=0;i<=2;i++) {
			try {
				
				driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
